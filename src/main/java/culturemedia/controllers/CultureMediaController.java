package culturemedia.controllers;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.service.CulturotecaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CultureMediaController {

	private final CulturotecaService culturotecaService;


	public CultureMediaController(CulturotecaService culturotecaService) {
		this.culturotecaService= culturotecaService;
	}

	@GetMapping("/videos")
	public List<Video> findAllVideos() throws VideoNotFoundException {
        List<Video> videos = culturotecaService.findAll();
		if (videos.isEmpty()) {throw new VideoNotFoundException();
		}
		return videos;
	}

	@PostMapping("/videos")
	public Video save(@RequestBody Video save) {
		Video video = null;
        video = culturotecaService.save(save);
        return video;


	}


}
