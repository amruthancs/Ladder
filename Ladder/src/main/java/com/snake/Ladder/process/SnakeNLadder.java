package com.snake.Ladder.process;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class SnakeNLadder {
	
	final static int WINPOINT = 100;
	static int player1Position=0;
	static Map<Integer, Integer> snake = new HashMap<>();
	static Map<Integer, Integer> ladder = new HashMap<>();
	{
		snake.put(99, 54);
		snake.put(70, 55);
		snake.put(52, 42);
		snake.put(25, 2);
		snake.put(95, 72);

		ladder.put(6, 25);
		ladder.put(11, 40);
		ladder.put(60, 85);
		ladder.put(46, 90);
		ladder.put(17, 69);
	}

	// this method will generate random number from 1-6 public int rollDice() {
	

	/*
	 * calculatePlayerValue() method will calculate the position of the player based
	 * on his current position after rolling the dice.
	 */

	public int calculatePlayerValue(int playerPosition, int diceValue) {
		int playerNewPosition = playerPosition + diceValue;

		if (playerNewPosition > WINPOINT)
			return playerPosition;

		if (null != snake.get(playerNewPosition)) {
			System.out.println("Oops..swallowed by the snake..");
			playerNewPosition = snake.get(playerNewPosition);
		}

		if (null != ladder.get(playerNewPosition)) {
			System.out.println("YAY! climbing the ladder..");
			playerNewPosition = ladder.get(playerNewPosition);
		}

		return playerNewPosition;
	}

	public boolean isWin(int playerPosition) {
		return WINPOINT == playerPosition;
	}

	public int startGame(int value) {
		int diceValue = value;
               if(value==0)
               {
            	   player1Position=0;
            	   return 0;
               }
				player1Position = calculatePlayerValue(player1Position, diceValue);
				if (isWin(player1Position)) {
					return 100;
				}
				else
					return player1Position;
			
	}
}

