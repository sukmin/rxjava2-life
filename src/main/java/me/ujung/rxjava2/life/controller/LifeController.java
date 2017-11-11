package me.ujung.rxjava2.life.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ujung.rxjava2.life.model.Life;
import me.ujung.rxjava2.life.service.LifeService;

@RestController
public class LifeController {

	private LifeService syncLifeService;

	@Autowired
	public LifeController(LifeService syncLifeService) {
		this.syncLifeService = syncLifeService;
	}

	@GetMapping("/life/sync")
	public Life getLife() {
		return syncLifeService.getLife();
	}

}
