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
}