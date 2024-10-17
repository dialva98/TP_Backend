package culturemedia.repository;
import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.Reproduccion;

public interface CulturotecaService {
    List<Video> findAll(); // listar todos los videos
    Video save(Video save); // agregar video
    Reproduccion save(Reproduccion save); // agregar reproduccion
}
