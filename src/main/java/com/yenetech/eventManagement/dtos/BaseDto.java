package com.yenetech.eventManagement.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseDto implements Serializable {
    private static final long serialVersionUID = 1922960209727830410L;

    private Long id;
}
