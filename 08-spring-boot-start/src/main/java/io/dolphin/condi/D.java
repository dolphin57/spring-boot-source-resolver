package io.dolphin.condi;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty("io.dolphin.condition")
@DolphinConditionAnnotation({"io.dolphin.condition1", "io.dolphin.condition2"})
public class D {
}
