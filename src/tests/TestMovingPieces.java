package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import levelPieces.Barista;
import levelPieces.CakePop;
import levelPieces.LongLine;
import levelPieces.PlasticStraw;

class TestMovingPieces {


	@Test
	void baristaMoveTest(){
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Barista tessa = new Barista('B', "lable", 10);
		tessa.move(gameBoard, 12);
		assertEquals(11,tessa.getLocation());
		tessa.move(gameBoard, 8);
		assertEquals(10,tessa.getLocation());
	}

	@Test
	void longLineMoveTest(){
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		LongLine longLine = new LongLine('B', "lable", 10);
		longLine.move(gameBoard, 13);
		assertEquals(12,longLine.getLocation());
		longLine.move(gameBoard,8);
		assertEquals(10,longLine.getLocation());
	}

	@Test
	void plasticStrawMoveTest(){
		// Each test will create its own gameBoard
				Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
				// Start with 1, leaves 0 open
				for (int i=1;i<=5; i++)
					gameBoard[i] = new CakePop();
				// Leave 6 open
				for (int i=7; i<=11; i++)
					gameBoard[i] = new CakePop();
				// Leave 12, 13 and 20 open, assume player in 13
				for (int i=14; i<20; i++)
					gameBoard[i] = new CakePop();
				// Place Sniper in an open space - 6
				// Note that Sniper location will be updated via move method, 
				// so occasionally location 6 will be open and may be chosen
				PlasticStraw plasticStraw = new PlasticStraw('P', "label", 6);
				gameBoard[6] = plasticStraw;
				int count0 = 0;
				int count6 = 0;
				int count12 = 0;
				int count20 = 0;
				for (int i=0; i<4; i++) {
					plasticStraw.move(gameBoard, 13);
					int loc = plasticStraw.getLocation();
					// ensure no other space is chosen
					if (loc != 0 && loc != 6 && loc != 12 && loc != 20)
						fail("Invalid square selected");
					// counters to ensure every valid option is chosen
					if (loc == 0) count0++;
					if (loc == 6) count6++;
					if (loc == 12) count12++;
					if (loc == 20) count20++;
				}
				// Ensure each option is randomly chosen some number of times. 
				assert(count0 > 1);
				assert(count6 > 1);
				assert(count12 > 1);
				assert(count20 > 1);
	}
	
	
}
