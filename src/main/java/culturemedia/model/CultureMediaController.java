package culturemedia.model;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.service.impl.CulturotecaServiceImpl;

public class CultureMediaController {

	private final CulturotecaServiceImpl cultureMediaService;


	public CultureMediaController(CulturotecaServiceImpl cultureMediaService) {
		this.cultureMediaService = cultureMediaService;
	}


	public List<Video> find_allVideos() throws VideoNotFoundException {
		List<Video> videos = null;
		videos = cultureMediaService.findAll();
		return videos;
	}


}
