package controllers;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video; //No se esta usando
import culturemedia.service.impl.CulturotecaServiceImpl;

public class CultureMediaController { //No hay una relacion de implementacion definida

	private final CulturotecaServiceImpl cultureMediaService;


	public CultureMediaController(CulturotecaServiceImpl cultureMediaService) {
		this.cultureMediaService = cultureMediaService;
	}


	public List<Video> find_allVideos() throws VideoNotFoundException { //find_allVideos() no esta definido
		List<Video> videos = null;
		videos = cultureMediaService.findAll();
		return videos;
	}


}
