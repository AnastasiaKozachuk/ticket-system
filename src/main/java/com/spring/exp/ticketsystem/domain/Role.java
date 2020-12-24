package com.spring.exp.ticketsystem.domain;

import com.spring.exp.ticketsystem.domain.enums.RoleValue;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Role implements GrantedAuthority {

    @Id
    @Enumerated(EnumType.STRING)
    private RoleValue id;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(cascade = {CascadeType.MERGE}, mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    protected Role(final RoleValue id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return "ROLE_" + id.toString();
    }
}
