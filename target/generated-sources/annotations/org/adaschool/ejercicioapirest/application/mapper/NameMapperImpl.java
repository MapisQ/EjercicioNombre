package org.adaschool.ejercicioapirest.application.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.adaschool.ejercicioapirest.domain.dto.NameDto;
import org.adaschool.ejercicioapirest.domain.entity.NameEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-03T08:15:27-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class NameMapperImpl implements NameMapper {

    @Override
    public NameEntity toEntity(NameDto dto) {
        if ( dto == null ) {
            return null;
        }

        NameEntity.NameEntityBuilder nameEntity = NameEntity.builder();

        nameEntity.id( dto.id() );
        nameEntity.name( dto.name() );

        return nameEntity.build();
    }

    @Override
    public NameDto toDto(NameEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Integer id = null;
        String name = null;

        id = entity.getId();
        name = entity.getName();

        NameDto nameDto = new NameDto( id, name );

        return nameDto;
    }

    @Override
    public List<NameEntity> toEntityList(List<NameDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<NameEntity> list = new ArrayList<NameEntity>( dtoList.size() );
        for ( NameDto nameDto : dtoList ) {
            list.add( toEntity( nameDto ) );
        }

        return list;
    }

    @Override
    public List<NameDto> toDtoList(List<NameEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<NameDto> list = new ArrayList<NameDto>( entityList.size() );
        for ( NameEntity nameEntity : entityList ) {
            list.add( toDto( nameEntity ) );
        }

        return list;
    }
}
