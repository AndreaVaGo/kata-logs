package dev.andrea.logs;

public class LogLine {

    private String line;

    public LogLine(String line) {
        this.line = line;
    }

    public LogLevel getLogLevel() {
        String code = line.substring(1, 4);

        for (LogLevel level : LogLevel.values()) {
            if (level.getCode().equals(code)) {
                return level;
            }
        }

        return LogLevel.UNKNOWN;
    }

}
