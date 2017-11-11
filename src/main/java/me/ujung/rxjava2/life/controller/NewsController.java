package me.ujung.rxjava2.life.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ujung.rxjava2.life.model.News;

@RestController
public class NewsController {

	@GetMapping("/news")
	public List<News> getNews() throws InterruptedException {
		Thread.sleep(3_000L);
		return createDummy();
	}

	private List<News> createDummy() {
		List<News> news = new ArrayList<>();
		news.add(new News("김기웅 CTO 노벨평화상 수상", "njoybts개발자로 유명한 김기웅 CTO가 노벨평화상을 수상했다."));
		news.add(new News("김민주 의장 구글 인수", "김민주 회장이 구글을 인수했다."));
		news.add(new News("강감찬 장군 추모", "강감찬 장군 추모열기가 대단하다."));
		return news;
	}

}
