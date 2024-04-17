package dev.byli.a.controller;

import dev.byli.sdk.a.dto.DummyDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    @GetMapping
    public DummyDto index() {
        DummyDto dummyDto = new DummyDto();
        dummyDto.setName("Service A");
        dummyDto.setDescription("Hello, Service A!");
        return dummyDto;
    }
}
