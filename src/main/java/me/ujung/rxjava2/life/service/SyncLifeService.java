package me.ujung.rxjava2.life.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import me.ujung.rxjava2.life.model.Life;
import me.ujung.rxjava2.life.model.News;
import me.ujung.rxjava2.life.model.Stock;
import me.ujung.rxjava2.life.model.Weather;

@Service
public class SyncLifeService implements LifeService {

	private RestTemplate restTemplate;

	@Autowired
	public SyncLifeService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public Life getLife() {

		String newsUrl = "http://127.0.0.1:9090/news";
		List<News> news = restTemplate.getForObject(newsUrl, List.class);

		String stocksUrl = "http://127.0.0.1:9090/stocks";
		List<Stock> stocks = restTemplate.getForObject(stocksUrl, List.class);

		String weatherUrl = "http://127.0.0.1:9090/weather";
		Weather weather = restTemplate.getForObject(weatherUrl, Weather.class);

		return new Life(news, stocks, weather);
	}

}
