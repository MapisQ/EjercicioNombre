package org.adaschool.ejercicioapirest.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record NameDto(
        Integer id,
        String name
) {}
