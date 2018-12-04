package com.spring.picturespage.service;

import com.spring.picturespage.model.Picture;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PictureService {

	/**
	 * Pictures list data.
	 */
	private List<Picture> picturesList = new ArrayList<>();

	@PostConstruct
	private void init() {
		picturesList.add(new Picture("Sea Cafe", "https://images.pexels.com/photos/237272/pexels-photo-237272.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
		picturesList.add(new Picture("Sea Wave", "https://pattayaone.news/wp-content/uploads/2018/06/wave-2211925_960_720.jpg"));
		picturesList.add(new Picture("Moon", "https://cdn.vox-cdn.com/thumbor/YJhfHa3VIYPvLAybdpmqXeR0E68=/0x0:4000x2411/1820x1213/filters:focal(1680x886:2320x1526):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/57941277/870390220.jpg.0.jpg"));
		picturesList.add(new Picture("People Friends", "https://image.freepik.com/free-photo/multiracial-group-of-young-people-taking-selfie_1139-1032.jpg"));
		picturesList.add(new Picture("People Faces", "http://kevin-moseri.de/wp-content/uploads/2015/12/inclusion.jpg"));
	}

	public List<Picture> getAllPictures() {
		return picturesList;
	}

	public List<Picture> searchPicturesByHeading(String query) {
		List<Picture> result = new ArrayList<>();

		for (Picture picture : picturesList) {
			if (picture.getHeading().toLowerCase().contains(query.toLowerCase())) {
				result.add(picture);
			}
		}

		return result;
	}

}
