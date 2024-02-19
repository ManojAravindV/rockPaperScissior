package com.viewdoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {
	
	@GetMapping(path="/")
	public String welcom() {
		return "Welcom to the geme";
	}
	@GetMapping(path="/playRPS")
	public String hello() {
		return "game.html";
	}

}
