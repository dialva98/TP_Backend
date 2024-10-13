package culturemedia.exception;

public class VideoNotFoundException extends Exception {
    public VideoNotFoundException(String title) {
        super("El Video"+ title "no fue encontrado");
    }
}
