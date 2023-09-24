package com.jwang945.api.resume.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.YearMonthDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.YearMonthSerializer;
import lombok.Data;

import java.time.YearMonth;

@Data
public class TimePeriod {
    @JsonDeserialize(using = YearMonthDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/yyyy")
    private YearMonth startDate;
    @JsonDeserialize(using = YearMonthDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/yyyy")
    private YearMonth endDate;
    private String description;
}

