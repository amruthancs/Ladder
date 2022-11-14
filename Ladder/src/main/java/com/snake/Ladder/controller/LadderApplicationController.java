package com.snake.Ladder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.snake.Ladder.bean.Play;
import com.snake.Ladder.bean.Start;
//import com.snake.Ladder.service.SnakeNLadderService;
import com.snake.Ladder.bean.Startreq;
import com.snake.Ladder.service.SnakeNLadderService;

@RestController
public class LadderApplicationController {
	
	@Autowired
	private SnakeNLadderService snakeNLadderService;

	@GetMapping(value="/start",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Start> start(@RequestBody Start startreq){
		System.out.println(startreq.getValue());
		Start start = new Start();
		if(startreq.getValue().equalsIgnoreCase("start"))
		{
		start.setValue("READY");
		snakeNLadderService.startOver();
		return new ResponseEntity<>(start,HttpStatus.OK);
		}
		return new ResponseEntity<>(start,HttpStatus.BAD_REQUEST);
	
	}
	@PostMapping(value="/play",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Play> play(@RequestBody Play playreqbean){
		Play play = new Play();
		int val = snakeNLadderService.plays(playreqbean);
		System.out.println(playreqbean.getValue()+" value");
		if(val==100)
		{
			play.setResult("You won");
		}
		play.setPosition(val);
		//start.setValue("Ready");
		return new ResponseEntity<>(play,HttpStatus.OK);
	
	}
}
