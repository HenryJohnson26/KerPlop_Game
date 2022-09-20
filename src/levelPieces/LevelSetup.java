package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

public class LevelSetup {
	
	private ArrayList<Moveable> movingPieces;
	private Drawable[] gameBoard;
	private ArrayList<GamePiece> gamePieces;
	private int playerStartLoc = GameEngine.BOARD_SIZE/2;
	
	public LevelSetup() {
		//TODO: initialize instance data as needed
		movingPieces = new ArrayList<>();
		gamePieces = new ArrayList<>();
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	}
	
	public void createLevel(int levelNum) {
		//TODO: create the level
		//adding enemies
		//level1:
		//player is a basic white trying to get the awful pumpkin spice latte
		//1 barista :is a minion
		//long line: sniper
		//wrongly spelled name: doormat
		//plastic straw: kills immediately
		Barista barista = new Barista('b', "barista", GameEngine.BOARD_SIZE%2);
		movingPieces.add(barista);
		gamePieces.add(barista);
		gameBoard[barista.getLocation()] = barista;
		LongLine longLine = new LongLine('L', "Long Line", GameEngine.BOARD_SIZE-2);
		movingPieces.add(longLine);
		gamePieces.add(longLine);
		gameBoard[longLine.getLocation()] = longLine;

	}
	
	public Drawable[] getBoard() {
		return gameBoard;
	}
	
	public ArrayList<Moveable> getMovingPieces(){
		return movingPieces;
	}
	
	public ArrayList<GamePiece> getInteractingPieces(){
		return gamePieces;
	}
	
	public int getPlayerStartLoc() {
		return playerStartLoc;
	}

}
