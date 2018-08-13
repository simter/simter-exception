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
}