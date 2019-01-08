package tech.simter.exception;

/**
 * @author RJ
 */
public class PermissionDeniedException extends SecurityException {
  public PermissionDeniedException() {
  }

  public PermissionDeniedException(String message) {
    super(message);
  }

  public PermissionDeniedException(String message, Throwable cause) {
    super(message, cause);
  }

  public PermissionDeniedException(Throwable cause) {
    super(cause);
  }
}