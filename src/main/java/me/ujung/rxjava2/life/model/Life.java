package me.ujung.rxjava2.life.model;

import java.util.List;

public class Life {

	private List<News> news;
	private List<Stock> stocks;
	private Weather weather;

	public Life() {
	}

	public Life(List<News> news, List<Stock> stocks, Weather weather) {
		this.news = news;
		this.stocks = stocks;
		this.weather = weather;
	}

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}
}
