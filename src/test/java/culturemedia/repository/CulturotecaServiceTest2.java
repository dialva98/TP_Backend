import java.util.List;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.impl.CulturotecaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import culturemedia.model.Video;
import culturemedia.repository.impl.VideoRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

class CulturotecaServiceTest2 {

    private VideoRepository videoRepository;

    @BeforeEach
    void init() {
        videoRepository = new CulturotecaServiceImpl();
        Muestras();
    }

    void Muestras(){
        List<Video> videos = List.of(new Video("01", "Título 1", "----", 4.5),
                new Video("02", "Título 2", "----", 5.5),
                new Video("03", "Título 3", "----", 4.4),
                new Video("04", "Título 4", "----", 3.5),
                new Video("05", "Clic 5", "----", 5.7),
                new Video("06", "Clic 6", "----", 5.1));

        for ( Video video : videos ) {
            videoRepository.save( video );
        }

    }

    @Test
    void when_FindByTitle_should_be_returned_successfully() throws VideoNotFoundException {
        List<Video> videos = videoRepository.find("Clic" );
        assertEquals(2, videos.size());
    }

    @Test
    void when_FindByTitle_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully(){
        videoRepository = new CulturotecaServiceImpl();
        assertThrows(VideoNotFoundException.class, () -> {
            videoRepository.find("Clic" );
        });
    }
}
