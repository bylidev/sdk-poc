package dev.byli.sdk.a.exception;

public class DummyException extends RuntimeException {
    public DummyException(String message) {
        super(message);
    }

    public DummyException(Throwable cause) {
        super(cause);
    }
}
