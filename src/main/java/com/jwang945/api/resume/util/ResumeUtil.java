package com.jwang945.api.resume.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.jwang945.api.resume.dto.Resume;
import lombok.extern.slf4j.Slf4j;
import java.io.InputStream;

@Slf4j
public class ResumeUtil {
    public static Resume getResume(){
        try(InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream("static/jwang945data.json")){
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            return mapper.readValue(in, Resume.class);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
