package com.jwang945.api.resume.dto;

import lombok.Data;

import java.util.List;
@Data
public class Project {
    private String name;
    private String description;
    private String link;
    private List<String> utilizedSkills;
}
