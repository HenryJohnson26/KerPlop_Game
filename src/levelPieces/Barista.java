package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import gameEngine.Player;

public class Barista extends GamePiece implements Moveable, Drawable {

    /**
     * Constructor for the game piece
     *
     * @param symbol   symbol for the game piece
     * @param label    TODO
     * @param location initial location
     */
    public Barista(char symbol, String label, int location) {
        super(symbol, label, location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        //moves one piece at a time torwards the player
        if(getLocation()<playerLocation)setLocation(getLocation()+1);
        else setLocation(getLocation()-1);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if(Math.abs(playerLocation-getLocation())==1)return InteractionResult.HIT;
        return null;
    }
}
