package com.snake.Ladder.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Startreq {
	 private String value = "Invalid Keyword";

	 @JsonProperty(value="value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Startreq() {
		super();
	}
	 
}
