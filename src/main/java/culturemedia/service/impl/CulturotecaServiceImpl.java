package culturemedia.service.impl;

import culturemedia.exception.DurationNotValidException;
import culturemedia.service.CulturotecaService;
import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.Reproduccion;
import culturemedia.repository.ReproduccionRepository;
import culturemedia.repository.VideoRepository;

public abstract class CulturotecaServiceImpl implements CulturotecaService {
    public VideoRepository video;
    public ReproduccionRepository reproduccion;

    public CulturotecaServiceImpl(VideoRepository video, ReproduccionRepository reproduccion) {
        this.video = video;
        this.reproduccion = reproduccion;
    }

    public List<Video> findAll() {
        return this.video.findAll();
    }

    public Video save(@org.jetbrains.annotations.NotNull Video video) throws DurationNotValidException {
        if (video.duration() <= 0) {
            throw new DurationNotValidException(video.title(), video.duration());}
        return this.video.save(video);
    }

    public Reproduccion save(Reproduccion reproduccion){
        return this.reproduccion.save(reproduccion);
}
}


