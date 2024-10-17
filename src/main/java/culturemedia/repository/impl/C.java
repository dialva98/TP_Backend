import culturemedia.exception.DurationNotValidException;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.repository.CulturotecaService;
import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.Reproduccion;
import culturemedia.repository.ReproduccionRepository;
import culturemedia.repository.VideoRepository;
import java.util.stream.Collectors;


public abstract class CulturotecaServiceImpl implements CulturotecaService {
    public VideoRepository video;
    public ReproduccionRepository reproduccion;

    public CulturotecaServiceImpl(VideoRepository video, ReproduccionRepository reproduccion) {
        this.video = video;
        this.reproduccion = reproduccion;
    }
}

    @Override
    public List<Video> findAll() {
        return this.video.findAll();
    }

    @Override
    public Video save(Video video) throws DurationNotValidException {
        if (video.duration() <= 0) {
            throw new DurationNotValidException(video.title(), video.duration());
            return.this.video.save(video)

    @Override
    public Reproduccion save(Reproduccion reproduccion) {
                return.this.reproduccion.save(reproduccion)
            }
    }
