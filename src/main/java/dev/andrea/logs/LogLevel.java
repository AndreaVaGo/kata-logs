package dev.andrea.logs;

public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("", 0);

    private final String code;
    private final int valor;

    private LogLevel(String code, int valor) {
        this.code = code;
        this.valor = valor;
    }

    public String getCode() {
        return code;
    }

}
