package com.imdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imdb")
public class MovieController {
	
	@RequestMapping("/list")
	public String listMovies(Model theModel)
	{
		return "list-movies";
	}

}
