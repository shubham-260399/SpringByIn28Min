package com.in28miniutes.learnspringframework;

import com.in28miniutes.learnspringframework.game.GameRunner;
import com.in28miniutes.learnspringframework.game.MarioGame;
import com.in28miniutes.learnspringframework.game.PacmanGame;
import com.in28miniutes.learnspringframework.game.SuperContraGame;

public class App01BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		var game =new PacmanGame();
		//var game =new SuperContraGame();
		var gameRunner=new GameRunner(game);
		
		gameRunner.run();

	}

}
