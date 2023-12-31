package com.stratosphere.strmoonlogs;

import com.stratosphere.strmoonlogs.application.ports.HttpRequestLogsPort;
import com.stratosphere.strmoonlogs.application.usecases.ValidateMaxRequestUseCaseImpl;
import com.stratosphere.strmoonlogs.domain.usecases.PreviewHttpRequestLogUseCase;
import com.stratosphere.strmoonlogs.domain.usecases.ValidateMaxRequestUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
    @Bean
    public ValidateMaxRequestUseCase getValidateMaxRequestUseCase(final HttpRequestLogsPort port) {
         return new ValidateMaxRequestUseCaseImpl();
    }
}
