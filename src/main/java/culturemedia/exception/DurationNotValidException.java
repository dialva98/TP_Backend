package culturemedia.exception;

public class DurationNotValidException extends Exception {
    public DurationNotValidException(String title, Double duration) {
        super("No se encontraron videos cuya duracion esté en el rango indicado");
    }
}
