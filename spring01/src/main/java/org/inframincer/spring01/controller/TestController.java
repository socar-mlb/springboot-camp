package org.inframincer.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/plus")
    public String plus(
            @RequestParam("value1") int value1,
            @RequestParam("value2") int value2) {
        return String.format("result: %s", value1 + value2);
    }
}
