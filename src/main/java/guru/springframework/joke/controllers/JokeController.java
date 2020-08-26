package guru.springframework.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import guru.springframework.joke.services.JokeService;

public class JokeController {

	private JokeService jokeservice;

	@Autowired
	public JokeController(JokeService jokeservice) {
		this.jokeservice = jokeservice;
	}
	
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeservice.getJoke());
		return "chucknorris";
	}
}
