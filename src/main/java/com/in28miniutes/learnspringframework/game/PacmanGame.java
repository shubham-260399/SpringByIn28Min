package com.in28miniutes.learnspringframework.game;

public class PacmanGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Swim");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go Back");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Dive");

		
	}
	

}
