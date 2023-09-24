package com.jwang945.api.resume.dto;

import lombok.Data;

@Data
public class Resume {
    private Name name;
    private String emailAddress;
    private String phoneNumber;
    private Education education;
}
