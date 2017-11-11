package me.ujung.rxjava2.life.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {

	@GetMapping("/monitor")
	public String monitor() {
		return "OK";
	}

}
