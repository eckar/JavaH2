package com.example.demos.JavaH2.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "app/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
}
