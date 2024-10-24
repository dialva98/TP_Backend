package culturemedia.service.impl;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.service.CulturotecaService;

import java.util.ArrayList;
import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.Reproduccion;
import culturemedia.repository.ReproduccionRepository;
import culturemedia.repository.VideoRepository;

public abstract class CulturotecaServiceImpl implements CulturotecaService, VideoRepository, ReproduccionRepository {
    public List<Video> videos;
    public List<Reproduccion> reproduccion;

    public void VideoRepositoryImpl() {
        videos = new ArrayList<>();
    }

    public void ReproduccionRepositoryImpl() {
        this.reproduccion = new ArrayList<>();
    }

    public List<Video> findAll() throws VideoNotFoundException {
        if (videos.isEmpty()) {
            throw new VideoNotFoundException();
        }
        return videos;
    }

    public Video save(Video video) {
        this.videos.add(video);
        return video;
    }

    public Reproduccion save(Reproduccion reproduccion) {
        this.reproduccion.add(reproduccion);
        return reproduccion;
    }
}





