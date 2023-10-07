package io.dolphin.property.actual;

import io.dolphin.property.aware.DolphinAware;
import io.dolphin.property.aware.Flag;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware, DolphinAware {
    private Environment env;

    private Flag flag;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(flag.isCanOperate());
        System.out.println(env.getProperty("dolphin.url"));
        System.out.println(env.getProperty("dolphin.avg.age"));
        System.out.println(env.getProperty("dolphin.website.path"));
        System.out.println(env.getProperty("dolphin.vm.name"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }

    @Override
    public void setFlag(Flag dolphinFlag) {
        flag = dolphinFlag;
    }
}
