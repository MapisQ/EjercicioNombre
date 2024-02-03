package org.adaschool.ejercicioapirest.application.mapper;

import org.adaschool.ejercicioapirest.application.mapper.base.IBaseMapper;
import org.adaschool.ejercicioapirest.domain.dto.NameDto;
import org.adaschool.ejercicioapirest.domain.entity.NameEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface NameMapper extends IBaseMapper {

    NameEntity toEntity(NameDto dto);
    NameDto toDto(NameEntity entity);
    List<NameEntity> toEntityList(List<NameDto> dtoList);
    List<NameDto> toDtoList(List<NameEntity> entityList);
}
