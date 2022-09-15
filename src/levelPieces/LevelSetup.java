package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

public class LevelSetup {
	
	private ArrayList<Moveable> movingPieces;
	private Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	private ArrayList<GamePiece> gamePieces;
	private int playerStartLoc = 0;
	
	public LevelSetup() {
		//TODO: initialize instance data as needed
	}
	
	public void createLevel(int levelNum) {
		//TODO: create the level 
	}
	
	public Drawable[] getBoard() {
		//TODO: return the game board
		return gameBoard;
	}
	
	public ArrayList<Moveable> getMovingPieces(){
		//TODO: return arraylist of moving pieces
		return movingPieces;
	}
	
	public ArrayList<GamePiece> getInteractingPieces(){
		//TODO: return game pieces
		return gamePieces;
	}
	
	public int getPlayerStartLoc() {
		//TODO: return starting location of player
		return playerStartLoc;
	}

}
