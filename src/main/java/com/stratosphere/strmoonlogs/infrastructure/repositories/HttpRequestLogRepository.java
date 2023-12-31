package com.stratosphere.strmoonlogs.infrastructure.repositories;


import com.stratosphere.strmoonlogs.infrastructure.repositories.entities.HttpRequestLogEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;

public interface HttpRequestLogRepository extends MongoRepository<HttpRequestLogEntity, ObjectId> {
    @Query("{ 'timestamp' : { $gte: ?0, $lt: ?1 }, 'userId': ?2 }")
    Long countByTimeStampBetween(Date start, Date end, String userId);
}
