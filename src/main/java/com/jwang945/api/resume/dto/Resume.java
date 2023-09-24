package com.jwang945.api.resume.dto;

import lombok.Data;

import java.util.List;

@Data
public class Resume {
    private Name name;
    private String emailAddress;
    private String phoneNumber;
    private List<Education> educationHistory;
    private List<Work> workHistory;
    private List<Project> projects;
    private List<Skill> skills;
    private List<Link> links;
}
