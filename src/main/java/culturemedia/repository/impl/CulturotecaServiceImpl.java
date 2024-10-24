package culturemedia.repository.impl;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.repository.CulturotecaService;

import java.util.ArrayList;
import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.Reproduccion;
import culturemedia.repository.ReproduccionRepository;
import culturemedia.repository.VideoRepository;

public class CulturotecaServiceImpl implements VideoRepository,ReproduccionRepository,CulturotecaService {
    private final List<Video> videos;
    private final List<Reproduccion> reproduccion;

    public CulturotecaServiceImpl() {
        videos = new ArrayList<>();
        this.reproduccion = new ArrayList<>();
    }

    @Override
    public List<Video> findAll() throws VideoNotFoundException {
        if (videos.isEmpty()) {
            throw new VideoNotFoundException();
        }
        return videos;
    }

    @Override
    public Video save(Video video) {
        this.videos.add(video);
        return video;
    }

    @Override
    public Reproduccion save(Reproduccion reproduccion) {
        this.reproduccion.add(reproduccion);
        return reproduccion;
    }

    @Override
    public List<Video> find(String title) throws VideoNotFoundException; {
        List<Video> filteredVideos = new ArrayList<Video>();
        for ( Video video : videos ) {
            if(video.title().contains(title)){
                filteredVideos.add(video);
            }
            if (filteredVideos.isEmpty()) {
                throw new VideoNotFoundException();
            }
        }
        return filteredVideos;
    }

    @Override
    public List<Video> find(Double fromDuration, Double toDuration) throws VideoNotFoundException; {
        List<Video> filteredVideos = new ArrayList<Video>();
        for ( Video video : videos ) {
            if(video.duration()> fromDuration && video.duration()< toDuration){
                filteredVideos.add(video);
            }
            if (filteredVideos.isEmpty()) {
                throw new VideoNotFoundException();
            }
        }
        return filteredVideos;
    }
}


