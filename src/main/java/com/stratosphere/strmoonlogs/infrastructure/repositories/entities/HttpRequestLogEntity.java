package com.stratosphere.strmoonlogs.infrastructure.repositories.entities;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "http_request_logs")
public class HttpRequestLogEntity {
    private ObjectId id;
    private String url;
    private String httpMethod;
    private Date timeStamp;
}
