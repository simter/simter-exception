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
}