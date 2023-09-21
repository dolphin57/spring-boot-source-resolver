package io.dolphin.listener.Observer.listener;

import io.dolphin.listener.Observer.event.WeatherEvent;
import io.dolphin.listener.Observer.event.SnowEvent;

public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}
