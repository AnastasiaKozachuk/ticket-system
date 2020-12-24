package com.spring.exp.ticketsystem.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.apache.commons.collections4.CollectionUtils.emptyIfNull;

public interface Converter<FROM, TO> {

    TO convert(FROM from);

    default List<TO> convertAll(Collection<FROM> objects) {
        return emptyIfNull(objects).stream().map(this::convert).collect(Collectors.toList());
    }
}
