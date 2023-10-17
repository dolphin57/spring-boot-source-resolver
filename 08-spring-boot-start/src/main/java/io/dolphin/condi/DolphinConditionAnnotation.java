package io.dolphin.condi;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(DolphinCondition.class)
public @interface DolphinConditionAnnotation {
    String[] value() default {};
}
