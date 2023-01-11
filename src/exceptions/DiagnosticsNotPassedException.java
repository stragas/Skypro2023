package exceptions;

public class DiagnosticsNotPassedException extends Exception {
    public DiagnosticsNotPassedException(String description) {
        super(description);
    }
}
