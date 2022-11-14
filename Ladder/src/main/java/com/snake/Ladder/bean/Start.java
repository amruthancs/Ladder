package com.snake.Ladder.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Start {

 private String value = "Invalid Keyword";

 @JsonProperty(value="value")
public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}
 
}
