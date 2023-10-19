package io.dolphin.weather;

import org.springframework.stereotype.Component;

public class WeatherService {
    private WeatherSource weatherSource;

    public WeatherService(WeatherSource weatherSource) {
        this.weatherSource = weatherSource;
    }

    public String getType() {
        return weatherSource.getType();
    }

    public String getRate() {
        return weatherSource.getRate();
    }
}
