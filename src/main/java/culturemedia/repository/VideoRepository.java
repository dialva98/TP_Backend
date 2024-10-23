package culturemedia.repository;
import java.util.List;
import culturemedia.model.Video;

public interface VideoRepository {
    List<Video> findAll(); // listar todos los videos
    Video save(Video video); // agregar video
    List<Video> find(String title); // encontrar un video por titulo
    List<Video> find(Double fromDuration, Double toDuration) // encontrar un video por duracion
}
