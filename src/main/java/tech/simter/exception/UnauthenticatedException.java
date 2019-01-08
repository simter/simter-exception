package tech.simter.exception;

/**
 * @author RJ
 */
public class UnauthenticatedException extends SecurityException {
  public UnauthenticatedException() {
  }

  public UnauthenticatedException(String message) {
    super(message);
  }

  public UnauthenticatedException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnauthenticatedException(Throwable cause) {
    super(cause);
  }
}