package io.dolphin.listener.springboot.listener;

import io.dolphin.listener.Observer.event.RainEvent;
import io.dolphin.listener.Observer.event.WeatherEvent;
import org.springframework.stereotype.Component;

@Component
public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}
