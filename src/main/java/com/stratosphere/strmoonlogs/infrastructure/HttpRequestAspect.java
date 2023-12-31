package com.stratosphere.strmoonlogs.infrastructure;


import com.stratosphere.strmoonlogs.domain.entities.HttpRequestLog;
import com.stratosphere.strmoonlogs.infrastructure.mappers.HttpRequestLogMapper;
import com.stratosphere.strmoonlogs.infrastructure.repositories.HttpRequestLogRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@Aspect
@Component
@RequiredArgsConstructor
public class HttpRequestAspect {
    private HttpServletRequest request;
    private HttpRequestLogRepository repository;
    private HttpRequestLogMapper mapper;
    @Before("execution(* com.stratosphere.strmoonlogs.infrasctructure.controllers.*(..))")
    public void logHttpRequest(JoinPoint joinPoint) {
        Map<String, String[]> map = request.getParameterMap();
        String userId = Arrays.toString(map.get("userId"));
        HttpRequestLog httpRequestLog = HttpRequestLog
                .builder()
                .httpMethod(request.getMethod())
                .url(request.getRequestURI())
                .timeStamp(new Date())
                .userId(userId)
                .build();
        repository.save(
                mapper.mapToEntity(httpRequestLog)
        );
    }

}
