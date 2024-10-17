package culturemedia.exception;

public class VideoNotFoundException extends CultureMediaException {
    public VideoNotFoundException(String title) {
        super("El Video no fue encontrado: " +title);
    }
}