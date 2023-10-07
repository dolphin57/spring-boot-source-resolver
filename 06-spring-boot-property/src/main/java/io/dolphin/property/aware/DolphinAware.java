package io.dolphin.property.aware;

import org.springframework.beans.factory.Aware;

public interface DolphinAware extends Aware {
    void setFlag(Flag flag);
}
