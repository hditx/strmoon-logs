package com.stratosphere.strmoonlogs.domain.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
public class HttpRequestLog {
    @Id
    private String id;
    private String url;
    private String httpMethod;
    private Date timeStamp;
    private String userId;
}
