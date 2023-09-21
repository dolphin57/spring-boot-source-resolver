package io.dolphin.listener.Observer.listener;

import io.dolphin.listener.Observer.event.WeatherEvent;
import io.dolphin.listener.Observer.event.RainEvent;

public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}
