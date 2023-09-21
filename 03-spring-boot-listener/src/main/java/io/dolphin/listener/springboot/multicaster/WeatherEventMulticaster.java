package io.dolphin.listener.springboot.multicaster;

import org.springframework.stereotype.Component;

@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {
    @Override
    protected void doSatrt() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    protected void doEnd() {
        System.out.println("end broadcast weather event");
    }
}
