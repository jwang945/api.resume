package com.jwang945.api.resume.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Work extends TimePeriod{
    private String location;
    private String organizationName;
}
