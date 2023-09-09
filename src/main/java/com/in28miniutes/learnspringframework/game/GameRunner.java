package com.in28miniutes.learnspringframework.game;

public class GameRunner {

	//MarioGame game;
	
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		
		this.game=game;
		
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running Game :"+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
