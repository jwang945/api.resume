package com.jwang945.api.resume.dto;

import lombok.Data;

@Data
public class Skill {
    private String name;
    private String description;
    private SkillCategory category;
}
