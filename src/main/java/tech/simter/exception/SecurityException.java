package tech.simter.exception;

/**
 * @author RJ
 */
public class SecurityException extends SimterException {
  public SecurityException() {
  }

  public SecurityException(String message) {
    super(message);
  }

  public SecurityException(String message, Throwable cause) {
    super(message, cause);
  }

  public SecurityException(Throwable cause) {
    super(cause);
  }
}