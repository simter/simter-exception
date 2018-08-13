package tech.simter.exception;

/**
 * @author RJ
 */
public class NotFoundException extends SimterException {
  public NotFoundException() {
  }

  public NotFoundException(String message) {
    super(message);
  }
}