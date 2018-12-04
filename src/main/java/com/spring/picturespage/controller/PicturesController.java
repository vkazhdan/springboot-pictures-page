package com.spring.picturespage.controller;

import com.spring.picturespage.model.Picture;
import com.spring.picturespage.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PicturesController {

	@Autowired
	private PictureService pictureService;

	@GetMapping("/pictures") // http://localhost:8080/pictures
	public String pictures(@RequestParam(required = false) String query, Model model) {


		// Get pictures list from service
		List<Picture> picturesList;
		if (query == null || query.isEmpty()) {
			picturesList = pictureService.getAllPictures();
		} else {
			picturesList = pictureService.searchPicturesByHeading(query);
		}

		// Set model attributes
		model.addAttribute("query", query);
		model.addAttribute("picturesList", picturesList);

		// Return html template name
		return "pictures";
	}

	@GetMapping("/") // http://localhost:8080/ redirects to http://localhost:8080/pictures
	public String index() {
		return "redirect:/pictures";
	}
}
