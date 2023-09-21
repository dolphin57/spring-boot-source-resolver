package io.dolphin.listener.Observer.event;

public class SnowEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "snow";
    }
}
