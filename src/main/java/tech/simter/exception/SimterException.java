package tech.simter.exception;

/**
 * @author RJ
 */
public class SimterException extends RuntimeException {
  public SimterException() {
  }

  public SimterException(String message) {
    super(message);
  }

  public SimterException(String message, Throwable cause) {
    super(message, cause);
  }

  public SimterException(Throwable cause) {
    super(cause);
  }
}