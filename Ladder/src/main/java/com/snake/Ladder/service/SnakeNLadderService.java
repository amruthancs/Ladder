package com.snake.Ladder.service;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snake.Ladder.bean.Play;
import com.snake.Ladder.process.SnakeNLadder;
  
  @Service 
  public class SnakeNLadderService {
  
  @Autowired 
  SnakeNLadder snakeNLadder; 
  public int plays(Play play ) { 
  return snakeNLadder.startGame(play.getValue()); 
  } 
  public void startOver()
  {
	  snakeNLadder.startGame(0);
  }
  }
 