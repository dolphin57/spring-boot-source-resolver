package io.dolphin.listener;

import io.dolphin.listener.springboot.listener.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ListenerApplicationTests {
	@Autowired
	private WeatherRunListener weatherRunListener;
	@Test
	void contextLoads() {
	}

	@Test
	public void testEvent() throws Exception {
		// 只需调用listener.rain,不需要感知内部构造事件和广播事件
		weatherRunListener.rain();
		weatherRunListener.snow();
	}
}
