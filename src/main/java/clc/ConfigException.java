package clc;

public class ConfigException extends RuntimeException {
    public ConfigException() {
        super();
    }

    public ConfigException(Throwable t) {
        super(t);
    }

    public ConfigException(String msg) {
        super(msg);
    }

    public ConfigException(String msg, Throwable t) {
        super(msg, t);
    }
}
