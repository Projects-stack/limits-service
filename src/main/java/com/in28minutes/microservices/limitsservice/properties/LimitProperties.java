package com.in28minutes.microservices.limitsservice.properties;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
@Configuration
@ConfigurationProperties(prefix = "limits-service")
public class LimitProperties
{
    @NotNull
    private Integer minimum;

    @NotNull
    private Integer maximum;
}
