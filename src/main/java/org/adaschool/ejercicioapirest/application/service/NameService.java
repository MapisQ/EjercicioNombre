package org.adaschool.ejercicioapirest.application.service;

import org.adaschool.ejercicioapirest.application.mapper.NameMapper;
import org.adaschool.ejercicioapirest.domain.dto.NameDto;
import org.adaschool.ejercicioapirest.domain.entity.NameEntity;
import org.adaschool.ejercicioapirest.domain.repository.NameRepository;
import org.springframework.stereotype.Service;

@Service
public record NameService(
        NameRepository repository,
        NameMapper mapper
) {
    public String getName(NameEntity entity){
        return entity.getName();
    }
}
