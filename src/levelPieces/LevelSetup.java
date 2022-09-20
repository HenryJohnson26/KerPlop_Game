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
		movingPieces = new ArrayList<>();
		gamePieces = new ArrayList<>();
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		//TODO: create the level
		//adding enemies
		//level1:
		//player is a basic white trying to get the awful pumpkin spice latte
		//1 barista :is a minion
		//long line: sniper
		//wrongly spelled name: doormat
		//plastic straw: kills immediately
		if(levelNum == 1) {
			Barista barista = new Barista('B', "Barista", GameEngine.BOARD_SIZE % 2);
			movingPieces.add(barista);
			gamePieces.add(barista);
			gameBoard[barista.getLocation()] = barista;
			WrongName wrongName = new WrongName('W', "Wrong Name", GameEngine.BOARD_SIZE - 6);
			gamePieces.add(wrongName);
			gameBoard[wrongName.getLocation()] = wrongName;
			CakePop cakePop = new CakePop('C', 4);
			gameBoard[cakePop.getLocation()] = cakePop;
			PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte('X', "Pumpkin Spice Latte", 12);
			gamePieces.add(pumpkinSpiceLatte);
			gameBoard[pumpkinSpiceLatte.getLocation()] = pumpkinSpiceLatte;
		}
		else if(levelNum == 2){
			LongLine longLine = new LongLine('L', "Long Line", GameEngine.BOARD_SIZE-2);
			movingPieces.add(longLine);
			gamePieces.add(longLine);
			gameBoard[longLine.getLocation()] = longLine;
			PlasticStraw plasticStraw = new PlasticStraw('S', "plastic straw", GameEngine.BOARD_SIZE/4);
			movingPieces.add(plasticStraw);
			gamePieces.add(plasticStraw);
			gameBoard[plasticStraw.getLocation()]=plasticStraw;
			WrongName wrongName = new WrongName('W', "Wrong Name", GameEngine.BOARD_SIZE - 6);
			gamePieces.add(wrongName);
			gameBoard[wrongName.getLocation()] = wrongName;
			PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte('X', "Pumpkin Spice Latte", 6);
			gamePieces.add(pumpkinSpiceLatte);
			gameBoard[pumpkinSpiceLatte.getLocation()] = pumpkinSpiceLatte;
		}
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
