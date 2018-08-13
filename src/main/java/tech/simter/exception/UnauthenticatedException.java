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
}