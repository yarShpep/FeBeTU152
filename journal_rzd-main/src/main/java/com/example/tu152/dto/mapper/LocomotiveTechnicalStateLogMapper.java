package com.example.tu152.dto.mapper;

import com.example.tu152.db.entity.LocomotiveTechnicalStateLogEntity;
import com.example.tu152.dto.domain.LocomotiveTechnicalStateLog;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocomotiveTechnicalStateLogMapper {
    LocomotiveTechnicalStateLog toDomain(LocomotiveTechnicalStateLogEntity journal);

    List<LocomotiveTechnicalStateLog> toDomain(List<LocomotiveTechnicalStateLogEntity> journals);

    LocomotiveTechnicalStateLogEntity toEntity(LocomotiveTechnicalStateLog journal);

    List<LocomotiveTechnicalStateLogEntity> toEntity(List<LocomotiveTechnicalStateLog> journals);
}
