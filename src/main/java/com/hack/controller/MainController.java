package com.hack.controller;

import com.hack.model.AppDto;
import com.hack.service.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final AppService service;

    public MainController(AppService service) {
        this.service = service;
    }

    public String saveApp(){
        return null;
    }

    @GetMapping("/api/app")
    public List<AppDto> getApp(){
        return service.getApp();
    }
}
