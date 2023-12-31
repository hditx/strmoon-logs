package com.stratosphere.strmoonlogs.infrastructure.mappers;

import com.stratosphere.strmoonlogs.domain.entities.HttpRequestLog;
import com.stratosphere.strmoonlogs.infrastructure.repositories.entities.HttpRequestLogEntity;
import org.mapstruct.*;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface HttpRequestLogMapper {
    HttpRequestLog mapToDomain(HttpRequestLogEntity httpRequestLogEntity);
    HttpRequestLogEntity mapToEntity(HttpRequestLog httpRequestLog);
}
