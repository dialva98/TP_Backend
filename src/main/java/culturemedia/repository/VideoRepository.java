package culturemedia.repository;
import java.util.List;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;

public interface VideoRepository {
    List<Video> findAll() throws VideoNotFoundException; // listar todos los videos
    Video save(Video video); // agregar video
    List<Video> find(String title) throws VideoNotFoundException; // encontrar un video por titulo
    List<Video> find(Double fromDuration, Double toDuration) throws VideoNotFoundException; // encontrar un video por duracion
}
