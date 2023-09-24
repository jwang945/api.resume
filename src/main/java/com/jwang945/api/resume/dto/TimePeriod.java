package com.jwang945.api.resume.dto;

import lombok.Data;

import java.time.YearMonth;

@Data
public class TimePeriod {
    private YearMonth startDate;
    private YearMonth endDate;
    private String description;
}

