package com.jwang945.api.resume.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum SkillCategory {
    BACKEND("BACKEND"),
    FRONTEND("FRONTEND"),
    CLOUD_COMPUTING("CLOUD_COMPUTING"),
    DEVOPS("DEVOPS"),
    ML("ML");

    private final String value;
}
