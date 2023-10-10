package io.dolphin.exception;

import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.boot.web.embedded.tomcat.ConnectorStartFailedException;
import org.springframework.boot.web.server.PortInUseException;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Component;

@Component
public class DolphinExitCodeExceptionMapper implements ExitCodeExceptionMapper {
    @Override
    public int getExitCode(Throwable exception) {
        if (exception instanceof ConnectorStartFailedException) {
            return 10;
        }
        return 0;
    }
}
