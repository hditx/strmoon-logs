package com.stratosphere.strmoonlogs.application.usecases;

import com.stratosphere.strmoonlogs.application.ports.HttpRequestLogsPort;
import com.stratosphere.strmoonlogs.domain.usecases.ValidateMaxRequestUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ValidateMaxRequestUseCaseImpl implements ValidateMaxRequestUseCase {
    private final HttpRequestLogsPort port;
    @Override
    public void execute() {
        port.checkRequest();
    }
}
