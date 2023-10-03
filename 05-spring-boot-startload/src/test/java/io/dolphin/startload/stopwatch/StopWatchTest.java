package io.dolphin.startload.stopwatch;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StopWatchTest {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch("myWatch");
        stopWatch.start("task1");
        Thread.sleep(2000L);
        stopWatch.stop();
        stopWatch.start("task2");
        Thread.sleep(3000L);
        stopWatch.stop();
        stopWatch.start("task3");
        Thread.sleep(1000L);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
