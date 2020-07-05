package io.dolphin.demo.controller;

import io.dolphin.demo.bean.Demo;
import io.dolphin.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * @Description:
 * @Author: Eric Liang
 * @Since: 2020-6-27 16:17
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable(value = "id")Long id) {
        return Optional.ofNullable(demoService.getDemoById(id)).map(Demo::toString).orElse("empty String");
    }
}
