package tech.simter.exception;

/**
 * @author RJ
 */
public class NonUniqueException extends SimterException {
  public NonUniqueException() {
  }

  public NonUniqueException(String message) {
    super(message);
  }

  public NonUniqueException(String message, Throwable cause) {
    super(message, cause);
  }

  public NonUniqueException(Throwable cause) {
    super(cause);
  }
}