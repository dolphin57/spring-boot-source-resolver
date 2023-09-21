package io.dolphin.listener.springboot.listener;

import io.dolphin.listener.Observer.event.SnowEvent;
import io.dolphin.listener.Observer.event.WeatherEvent;
import org.springframework.stereotype.Component;

@Component
public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}
