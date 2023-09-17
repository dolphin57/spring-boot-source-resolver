package io.dolphin.initializer.controller;

import io.dolphin.initializer.service.InitializerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: Eric Liang
 * @Since: 2020-6-27 16:17
 */
@Controller
@RequestMapping("/demo")
public class InitializerController {
    @Autowired
    private InitializerService initializerService;

    /**
     * 属性输出, key1--first，key2--second，key3--third
     * http://localhost:8080/demo/initializer/key2
     * @return
     */
    @RequestMapping("/initializer/{key}")
    @ResponseBody
    public String initializer(@PathVariable(value = "key")String key) {
        return initializerService.initializer(key);
    }
}
