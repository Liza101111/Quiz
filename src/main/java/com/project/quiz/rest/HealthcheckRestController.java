package com.project.quiz.rest;

import com.project.quiz.dto.HealthcheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/healthcheck")
public class HealthcheckRestController {

    @GetMapping
    public HealthcheckDto healthcheck() {
        HealthcheckDto dto = new HealthcheckDto(true,"It's working!" );
        return dto;
    }

}
