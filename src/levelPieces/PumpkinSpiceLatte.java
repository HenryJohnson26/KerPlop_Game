package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.Random;

public class PumpkinSpiceLatte extends GamePiece implements Drawable {
    /**
     * Constructor for the game piece
     *
     * @param symbol   symbol for the game piece
     * @param label    TODO
     * @param location initial location
     */
    Random r = new Random();
    public PumpkinSpiceLatte(char symbol, String label, int location) {
        super(symbol, label, location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        //gets a point if you are on it
        if(playerLocation == getLocation()){
            move(gameBoard);
            return InteractionResult.GET_POINT;
        }
        return InteractionResult.NONE;
    }

    //moves when a player gets it
    public void move(Drawable[] gameBoard) {
        //moves randomly
        int position = r.nextInt(GameEngine.BOARD_SIZE);
        gameBoard[getLocation()] = null;
        gameBoard[position] = this;
        setLocation(position);
    }
}
