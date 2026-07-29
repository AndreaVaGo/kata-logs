package dev.andrea.logs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LogLineTest {

    @Test
    void shouldReturnInfoLevel() {
        LogLine logLine = new LogLine("[INF]: File deleted");
        assertEquals(LogLevel.INFO, logLine.getLogLevel());
    }

    @Test
    void shouldReturnErrorLevel() {
        LogLine logLine = new LogLine("[ERR]: Stack Overflow");
        assertEquals(LogLevel.ERROR, logLine.getLogLevel());
    }
}
