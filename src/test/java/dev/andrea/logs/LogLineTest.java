package dev.andrea.logs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LogLineTest {

    @ParameterizedTest
    @MethodSource("logLevelExamples")
    void shouldReturnCorrectLogLevel(String input, LogLevel expected) {
        LogLine logLine = new LogLine(input);
        assertEquals(expected, logLine.getLogLevel());
    }

    static Stream<Arguments> logLevelExamples() {
        return Stream.of(
            Arguments.of("[TRC]: some message", LogLevel.TRACE),
            Arguments.of("[DBG]: some message", LogLevel.DEBUG),
            Arguments.of("[INF]: File deleted", LogLevel.INFO),
            Arguments.of("[WRN]: some message", LogLevel.WARNING),
            Arguments.of("[ERR]: Stack Overflow", LogLevel.ERROR),
            Arguments.of("[FTL]: some message", LogLevel.FATAL),
            Arguments.of("[XYZ]: Overly specific, out of context message", LogLevel.UNKNOWN)
        );
    }

    @Test
    void shouldReturnShortLog() {
        LogLine logLine = new LogLine("[ERR]: Stack Overflow");
        assertEquals("6:Stack Overflow", logLine.getOutputForShortLog());
    }
}
