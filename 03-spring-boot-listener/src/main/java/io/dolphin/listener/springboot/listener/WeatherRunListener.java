package io.dolphin.listener.springboot.listener;

import io.dolphin.listener.Observer.event.RainEvent;
import io.dolphin.listener.Observer.event.SnowEvent;
import io.dolphin.listener.springboot.multicaster.WeatherEventMulticaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherRunListener {
    @Autowired
    private WeatherEventMulticaster eventMulticaster;

    public void snow() {
        eventMulticaster.multicastEvent(new SnowEvent());
    }
    public void rain() {
        eventMulticaster.multicastEvent(new RainEvent());
    }
}
