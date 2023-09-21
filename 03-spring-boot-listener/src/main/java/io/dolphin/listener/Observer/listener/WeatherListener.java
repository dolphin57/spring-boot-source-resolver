package io.dolphin.listener.Observer.listener;

import io.dolphin.listener.Observer.event.WeatherEvent;

public interface WeatherListener {
    void onWeatherEvent(WeatherEvent event);
}
