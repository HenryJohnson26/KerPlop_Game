package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Barista;
import levelPieces.CakePop;
import levelPieces.LongLine;
import levelPieces.PlasticStraw;
import levelPieces.WrongName;

class TestInteractions {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testBarista() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Barista Tessa = new Barista('B', "label", 10);
		//Tests to see if it's a hit if they are on the same place
		gameBoard[11] = Tessa;
		assertEquals(InteractionResult.HIT, Tessa.interact(gameBoard, 11));
		
		//Putting the Barista in a new location to make sure they don't hit if not on same place
		assertEquals(InteractionResult.NONE, Tessa.interact(gameBoard, 12));
	}
	
	@Test
	public void testCakePop () {
		//No test because there is no interaction with the player
		
	}
	
	@Test
	public void testLongLine() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		LongLine tooManyPeople = new LongLine('L', "label", 10);
		
		gameBoard[10] = tooManyPeople;
		assertEquals(InteractionResult.KILL, tooManyPeople.interact(gameBoard, 11));
		
		assertEquals(InteractionResult.NONE, tooManyPeople.interact(gameBoard, 12));
	}
	
	@Test
	public void testPlasticStraw() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		PlasticStraw tutleKiller = new PlasticStraw('S', "label", 10);
		
		gameBoard[10] = tutleKiller;
		assertEquals(InteractionResult.HIT, tutleKiller.interact(gameBoard, 11));
		
		assertEquals(InteractionResult.NONE, tutleKiller.interact(gameBoard, 12));
	}
	
	@Test
	public void testWrongName() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		WrongName hoonrie = new WrongName('W', "label", 10);
		
		gameBoard[10] = hoonrie;
		assertEquals(InteractionResult.KILL, )
	}
	
}
