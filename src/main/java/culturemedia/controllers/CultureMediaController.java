package culturemedia.controllers;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.repository.CulturotecaService;

public class CultureMediaController {

	private final CulturotecaService culturotecaService;


	public CultureMediaController(CulturotecaService culturotecaService) {
		this.culturotecaService= culturotecaService;
	}


	public List<Video> findAllVideos() throws VideoNotFoundException {
		List<Video> videos = null;
		videos = culturotecaService.findAll();
		return videos;
	}


}
