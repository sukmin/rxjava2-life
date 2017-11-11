package me.ujung.rxjava2.life.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ujung.rxjava2.life.model.Stock;

@RestController
public class StockController {

	@GetMapping("/stocks")
	public List<Stock> getStocks() throws InterruptedException {
		Thread.sleep(2_500L);
		return createDummy();
	}

	private List<Stock> createDummy() {
		List<Stock> stocks = new ArrayList<>();
		stocks.add(new Stock("JYG", BigDecimal.valueOf(123_000_000L)));
		stocks.add(new Stock("카카오구글", BigDecimal.valueOf(423_000_000L)));
		stocks.add(new Stock("페이스네이버", BigDecimal.valueOf(623_000_000L)));
		return stocks;
	}

}
