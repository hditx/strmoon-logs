package com.stratosphere.strmoonlogs.infrastructure.repositories;


import com.stratosphere.strmoonlogs.infrastructure.repositories.entities.HttpRequestLogEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HttpRequestLogRepository extends MongoRepository<HttpRequestLogEntity, ObjectId> {
}
