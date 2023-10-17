package io.dolphin.condi;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

public class DolphinCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String[] properties = (String[]) metadata.getAnnotationAttributes("io.dolphin.condi.DolphinConditionAnnotation").get("value");
        for (String property : properties) {
            if (StringUtils.isEmpty(context.getEnvironment().getProperty(property))) {
                return false;
            }
        }
        return true;
    }
}
