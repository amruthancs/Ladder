package com.snake.Ladder.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Play {

	private int value;
	private int position;
	
	private String Result;
	 @JsonInclude(Include.NON_DEFAULT)
     @JsonProperty(value="Result")
	 public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}
	@JsonInclude(Include.NON_DEFAULT)
	@JsonProperty(value="value")
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@JsonProperty(value="position")
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
