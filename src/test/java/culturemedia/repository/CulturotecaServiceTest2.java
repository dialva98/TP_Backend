package culturemedia.repository;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.service.impl.CulturotecaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import culturemedia.model.Video;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CulturotecaServiceTest2 {

    @Mock
    private VideoRepository videoRepository;

    @InjectMocks
    private CulturotecaServiceImpl culturotecaService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }



    @Test
    void when_FindByTitle_should_be_returned_successfully() throws VideoNotFoundException {
        List<Video> expected = (List.of(new Video("01", "Título 1", "----", 4.5),
                new Video("02", "Título 2", "----", 5.5),
                new Video("03", "Título 3", "----", 4.4),
                new Video("04", "Título 4", "----", 3.5),
                new Video("05", "Clic 5", "----", 5.7),
                new Video("06", "Clic 6", "----", 5.1)));
        mockFindByTitle("Clic",expected);
        List<Video> actual = culturotecaService.find("Clic");
        assertEquals(expected.size(), actual.size());

    }
    private void mockFindByTitle(String title, List<Video> expected) throws VideoNotFoundException {
        when(videoRepository.find(title)).thenReturn(expected);
        if (expected.isEmpty()){when(videoRepository.find(title)).thenThrow(new VideoNotFoundException(title));}
    }

    @Test
    void when_FindByTitle_does_not_find_any_video_a_VideoNotFoundException_should_be_thrown_successfully() throws VideoNotFoundException {
        mockFindByTitle("NA", List.of());
        assertThrows(VideoNotFoundException.class, () -> culturotecaService.find("NA"));

    }

    @Test
    void when_FindByDuration_should_be_returned_successfully() throws VideoNotFoundException {
        List<Video> expected = (List.of(new Video("01", "Título 1", "----", 4.5),
                new Video("02", "Título 2", "----", 5.5),
                new Video("03", "Título 3", "----", 4.4),
                new Video("04", "Título 4", "----", 3.5),
                new Video("05", "Clic 5", "----", 5.7),
                new Video("06", "Clic 6", "----", 5.1)));
        mockFindByDuration(4.5,5.5,expected);
        List<Video> actual = culturotecaService.find(4.5,5.5);
        assertEquals(expected.size(), actual.size());}


    private void mockFindByDuration(Double fromDuration,Double toDuration, List<Video> expected) throws VideoNotFoundException {
        when(videoRepository.find(fromDuration, toDuration)).thenReturn(expected);
        if (expected.isEmpty()){
            when(videoRepository.find(fromDuration, toDuration)).thenThrow(new VideoNotFoundException());
        }

    }

    @Test
    void when_FindByDuration_does_not_find_any_video_a_VideoNotFoundException_should_be_thrown_successfully() throws VideoNotFoundException {
        mockFindByDuration(9.0,9.5,List.of());
        assertThrows(VideoNotFoundException.class, () -> culturotecaService.find(9.0,9.5));
    }
}