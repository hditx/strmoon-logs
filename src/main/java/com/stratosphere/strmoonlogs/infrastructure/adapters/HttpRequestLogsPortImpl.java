package com.stratosphere.strmoonlogs.infrastructure.adapters;

import com.stratosphere.strmoonlogs.application.ports.HttpRequestLogsPort;
import com.stratosphere.strmoonlogs.infrastructure.repositories.HttpRequestLogRepository;
import lombok.RequiredArgsConstructor;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@RequiredArgsConstructor
public class HttpRequestLogsPortImpl implements HttpRequestLogsPort {
    private final HttpRequestLogRepository repository;

    @Override
    public void checkRequest() {
        Instant now = Instant.now();
        Instant oneMinuteAgo = now.minus(1, ChronoUnit.MINUTES);
        repository.countByTimeStampBetween(Date.from(oneMinuteAgo), Date.from(now), "");
    }
}
