package io.github.millij.poi;

/**
 * Unsupport exception
 *
 * @author milli
 */
public class UnsupportedException extends RuntimeException {

    private static final long serialVersionUID = 3103542175797043236L;


    // Constructors
    // ------------------------------------------------------------------------

    public UnsupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedException(String message) {
        super(message);
    }


}
