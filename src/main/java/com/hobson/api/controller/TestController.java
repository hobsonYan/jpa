package com.hobson.api.controller;

import com.hobson.api.service.TestJpaRepositoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author yan hongbo
 * @date 2020/4/9 14:42
 * @description
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @Resource
    private TestJpaRepositoryService testJpaRepositoryService;

    @GetMapping("/get")
    @ResponseBody
    public Map<String, Object> get() {
        return testJpaRepositoryService.testJpa();
    }
}
