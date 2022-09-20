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
                    setLocation(getLocation() + 1);
                }
            } else if (getLocation() > playerLocation) {
                if (getLocation() - 2 > 0) {
                    setLocation(getLocation() - 2);
                } else {
                    setLocation(getLocation() - 1);
                }
            }
        }
        gameBoard[getLocation()] = this;
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return null;
    }
}
