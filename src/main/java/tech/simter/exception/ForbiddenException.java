package tech.simter.exception;

/**
 * @author RJ
 */
public class ForbiddenException extends SecurityException {
  public ForbiddenException() {
  }

  public ForbiddenException(String message) {
    super(message);
  }

  public ForbiddenException(String message, Throwable cause) {
    super(message, cause);
  }

  public ForbiddenException(Throwable cause) {
    super(cause);
  }
}