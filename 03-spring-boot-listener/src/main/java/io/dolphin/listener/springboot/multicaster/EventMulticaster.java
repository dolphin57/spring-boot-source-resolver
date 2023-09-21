package io.dolphin.listener.springboot.multicaster;

import io.dolphin.listener.Observer.event.WeatherEvent;
import io.dolphin.listener.springboot.listener.WeatherListener;

public interface EventMulticaster {
    void multicastEvent(WeatherEvent event);

    void addListener(WeatherListener weatherListener);

    void removeListener(WeatherListener weatherListener);
}
