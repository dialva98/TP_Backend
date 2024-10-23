package culturemedia.exception;

public class DurationNotValidException extends Exception {
    public DurationNotValidException(String title, Double duration) {
        super(+duration, "No es un duración válida para el video" +title);
    }
}
