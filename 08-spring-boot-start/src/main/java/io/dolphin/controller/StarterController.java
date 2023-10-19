package io.dolphin.controller;

import io.dolphin.weather.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/start")
public class StarterController {
    @Autowired
    private WeatherService weatherService;

    @RequestMapping("/weather")
    @ResponseBody
    public String weather() {
        return weatherService.getType() + "," + weatherService.getRate();
    }
}
