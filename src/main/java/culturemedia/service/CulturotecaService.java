package culturemedia.service;
import java.util.List;

import culturemedia.exception.DurationNotValidException;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.Reproduccion;

public interface CulturotecaService {
    List<Video> findAll() throws VideoNotFoundException; // listar todos los videos
    Video save(Video save) throws DurationNotValidException; // agregar video
    Reproduccion save(Reproduccion save); // agregar reproduccion
    List<Video> find(String title) throws VideoNotFoundException; // encontrar un video por titulo
    List<Video> find(Double fromDuration, Double toDuration) throws VideoNotFoundException; // encontrar un video por duracion
}
