package culturemedia.repository;

import java.util.List;

import culturemedia.exception.VideoNotFoundException;

import culturemedia.service.impl.CulturotecaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import culturemedia.model.Video;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CulturotecaServiceTest {

    @Mock
    private VideoRepository videoRepository;

    @InjectMocks
    private CulturotecaServiceImpl culturotecaService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() throws VideoNotFoundException {
        List<Video> expected = (List.of(new Video("01", "Título 1", "----", 4.5),
                new Video("02", "Título 2", "----", 5.5),
                new Video("03", "Título 3", "----", 4.4),
                new Video("04", "Título 4", "----", 3.5),
                new Video("05", "Clic 5", "----", 5.7),
                new Video("06", "Clic 6", "----", 5.1)));
        mockFindAll(expected);
        List<Video> actual = culturotecaService.findAll();
        assertEquals(expected, actual);

    }
    private void mockFindAll(List<Video> expected) throws VideoNotFoundException {
        when(videoRepository.findAll()).thenReturn(expected);
    }

    @Test
    void when_FindAll_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully() throws VideoNotFoundException {
        mockFindAll(List.of());
        assertThrows(VideoNotFoundException.class, () -> {
            culturotecaService.findAll();
        });
    }
}




