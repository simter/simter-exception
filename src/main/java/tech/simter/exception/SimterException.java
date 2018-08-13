package tech.simter.exception;

/**
 * @author RJ
 */
public class SimterException extends RuntimeException {
  public SimterException() {
  }

  public SimterException(String message) {
    super(message);
  }
}