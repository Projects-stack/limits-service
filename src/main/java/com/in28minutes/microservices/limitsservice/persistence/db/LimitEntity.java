package com.in28minutes.microservices.limitsservice.persistence.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class LimitEntity
{
    private Integer minimum;
    private Integer maximum;
}
