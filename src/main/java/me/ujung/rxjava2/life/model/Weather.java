package me.ujung.rxjava2.life.model;

public class Weather {

	private String condition;

	public Weather(){
	}

	public Weather(String condition) {
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
