package me.ujung.rxjava2.life.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ujung.rxjava2.life.model.Weather;

@RestController
public class WeatherController {

	private static final String[] CONDITIONS = {"맑음", "흐림", "소나기", "비"};

	@GetMapping("/weather")
	public Weather getWeather() throws InterruptedException {
		Thread.sleep(4_000L);
		return createDummy();
	}

	private Weather createDummy() {
		Random random = new Random();
		return new Weather(CONDITIONS[random.nextInt(CONDITIONS.length)]);
	}

}
