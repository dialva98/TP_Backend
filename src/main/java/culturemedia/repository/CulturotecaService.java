package culturemedia.repository;
import java.util.List;

import culturemedia.exception.DurationNotValidException;
import culturemedia.model.Video;
import culturemedia.model.Reproduccion;

public interface CulturotecaService {
    List<Video> findAll(); // listar todos los videos
    Video save(Video save) throws DurationNotValidException; // agregar video
    Reproduccion save(Reproduccion save); // agregar reproduccion
}
