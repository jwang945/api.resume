package com.jwang945.api.resume.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper = true)
public class Education extends TimePeriod{
    private String organizationName;
    private String location;
    private String degreeObtained;
    private String major;
    private Double GPA;
    private List<String> awards;
    private List<String> relevantCoursework;
}
