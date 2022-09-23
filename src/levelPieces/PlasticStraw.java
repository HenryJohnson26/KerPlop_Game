package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.Random;

public class PlasticStraw extends GamePiece implements Moveable, Drawable {
    /**
     * Constructor for the game piece
     *
     * @param symbol   symbol for the game piece
     * @param label    TODO
     * @param location initial location
     */
    private Random r = new Random();
    public PlasticStraw(char symbol, String label, int location) {
        super(symbol, label, location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        //moves randomly
        int position = r.nextInt(GameEngine.BOARD_SIZE);
        while(gameBoard[position]!=null||position == playerLocation) {
        	position = r.nextInt(GameEngine.BOARD_SIZE);
        }
        setLocation(position);
        gameBoard[getLocation()] = null;
        gameBoard[position] = this;
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        //hits if within one
        if(Math.abs(playerLocation-getLocation())==1){
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}
