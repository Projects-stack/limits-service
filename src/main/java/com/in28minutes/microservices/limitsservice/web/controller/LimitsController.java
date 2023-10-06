package com.in28minutes.microservices.limitsservice.web.controller;

import com.in28minutes.microservices.limitsservice.business.common.GlobalConstants;
import com.in28minutes.microservices.limitsservice.persistence.db.LimitEntity;
import com.in28minutes.microservices.limitsservice.properties.LimitProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(GlobalConstants.API)
public class LimitsController
{

    @Autowired
    private LimitProperties limitProperties;

    @GetMapping("/limits")
    public LimitEntity findOne()
    {
        return new LimitEntity(limitProperties.getMinimum(), limitProperties.getMaximum());
    }
}
