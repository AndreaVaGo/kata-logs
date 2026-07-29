package dev.andrea.logs;

public enum LogLevel {
    TRACE("TRC"),
    DEBUG("DBG"),
    INFO("INF"),
    WARNING("WRN"),
    ERROR("ERR"),
    FATAL("FTL"),
    UNKNOWN("");

    private final String code;

    private LogLevel(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
