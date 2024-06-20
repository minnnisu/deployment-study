package org.minnnisu.deploymentstudy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.version:1.0.0}")
    String version;

    @GetMapping("/")
    public String home() {
        return "home!";
    }

    @GetMapping("/version")
    public String version() {
        return "version: " + version;
    }

    @GetMapping("/friendship")
    public String test() {
        return "우정 영원하자!";
    }
}