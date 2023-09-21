package io.dolphin.listener.Observer.multicaster;

import io.dolphin.listener.Observer.event.WeatherEvent;
import io.dolphin.listener.Observer.listener.WeatherListener;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEventMulticaster implements EventMulticaster {
    private List<WeatherListener> listenerList = new ArrayList<>();

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
