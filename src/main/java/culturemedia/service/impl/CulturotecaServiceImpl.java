package culturemedia.service.impl;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.service.CulturotecaService;

import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.Reproduccion;
import culturemedia.repository.ReproduccionRepository;
import culturemedia.repository.VideoRepository;

public class CulturotecaServiceImpl implements CulturotecaService {
    private VideoRepository videoRepository;
    private final ReproduccionRepository reproduccionRepository;

    public CulturotecaServiceImpl(VideoRepository videoRepository, ReproduccionRepository reproduccionRepository) throws VideoNotFoundException {
        this.videoRepository = videoRepository;
        this.reproduccionRepository = reproduccionRepository;
    }

    @Override
    public List<Video> findAll() throws VideoNotFoundException {
        List<Video> videos = videoRepository.findAll();
        if (videos.isEmpty()) {
            throw new VideoNotFoundException();
        }
        return videos;
    }


    @Override
    public Video save(Video video) {
        return this.videoRepository.save(video);
    }

    @Override
    public Reproduccion save(Reproduccion reproduccion) {
        return this.reproduccionRepository.save(reproduccion);
    }

    @Override
    public List<Video> find(String title) throws VideoNotFoundException {
        List<Video> videos = videoRepository.find(title);
        if (videos.isEmpty()) {throw new VideoNotFoundException(title);
        }
        return videos;
    }

    @Override
    public List<Video> find(Double fromDuration, Double toDuration) throws VideoNotFoundException {
        List<Video> videos = videoRepository.find(fromDuration,toDuration);
        if (videos.isEmpty()) {
            throw new VideoNotFoundException("No encontrado");
        }
        return videos;
    }
}


