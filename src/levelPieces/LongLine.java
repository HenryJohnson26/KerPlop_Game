package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class LongLine extends GamePiece implements Moveable, Drawable {
    /**
     * Constructor for the game piece
     *
     * @param symbol   symbol for the game piece
     * @param label    TODO
     * @param location initial location
     */
    public LongLine(char symbol, String label, int location) {
        super(symbol, label, location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        //moves two torwards the player
        gameBoard[getLocation()]=null;
        if(getLocation()-2!=playerLocation&&getLocation()+2!=playerLocation) {
            if (getLocation() < playerLocation) {
                if (getLocation() + 2 < GameEngine.BOARD_SIZE) {
                    setLocation(getLocation() + 2);
                } else {
                }
            } else if (getLocation() > playerLocation) {
                if (getLocation() - 2 > 0) {
                    setLocation(getLocation() - 2);
                } else {
                }
            }
        }
        gameBoard[getLocation()] = this;
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        //kills if within 1
        //find player or long line
        if(Math.abs(playerLocation-getLocation())==1)return InteractionResult.KILL;
        return InteractionResult.NONE;
    }
}
