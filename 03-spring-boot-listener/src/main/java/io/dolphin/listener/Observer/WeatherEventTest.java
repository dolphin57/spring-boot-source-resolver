package io.dolphin.listener.Observer;

import io.dolphin.listener.Observer.event.RainEvent;
import io.dolphin.listener.Observer.event.SnowEvent;
import io.dolphin.listener.Observer.listener.RainListener;
import io.dolphin.listener.Observer.listener.SnowListener;
import io.dolphin.listener.Observer.multicaster.WeatherEventMulticaster;

public class WeatherEventTest {
    public static void main(String[] args) {
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();

        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);

        // begin rain end begin snow end
        eventMulticaster.multicastEvent(new RainEvent());
        eventMulticaster.multicastEvent(new SnowEvent());

        eventMulticaster.removeListener(rainListener);

        eventMulticaster.multicastEvent(new RainEvent());
        // begin end(rain已移除) begin snow end
        eventMulticaster.multicastEvent(new SnowEvent());

//        eventMulticaster.removeListener(snowListener);
    }
}
