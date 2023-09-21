package io.dolphin.listener.springboot.multicaster;

import io.dolphin.listener.Observer.event.WeatherEvent;
import io.dolphin.listener.springboot.listener.WeatherListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public abstract class AbstractEventMulticaster implements EventMulticaster {
    @Autowired
    private List<WeatherListener> listenerList;

    @Override
    public void multicastEvent(WeatherEvent event) {
        doSatrt();
        listenerList.forEach(i -> {
            i.onWeatherEvent(event);
        });
        doEnd();
    }

    @Override
    public void addListener(WeatherListener weatherListener) {
        listenerList.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        listenerList.remove(weatherListener);
    }
    protected abstract void doSatrt();
    protected abstract void doEnd();
}
