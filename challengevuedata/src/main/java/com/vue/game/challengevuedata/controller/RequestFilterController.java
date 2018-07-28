package com.vue.game.challengevuedata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestFilterController {

	@GetMapping("/get")
	public String methodcalledafterFilter() {
		
		return "this IP is not blocked";
	}
	
}
