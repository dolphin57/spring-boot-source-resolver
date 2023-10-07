package io.dolphin.property.actual;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware {
    private Environment env;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(env.getProperty("dolphin.url"));
        System.out.println(env.getProperty("dolphin.avg.age"));
        System.out.println(env.getProperty("dolphin.website.path"));
        System.out.println(env.getProperty("dolphin.vm.name"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }
}
