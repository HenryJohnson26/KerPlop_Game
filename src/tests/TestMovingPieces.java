package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.GameEngine;

class TestMovingPieces {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	


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

	}
}
