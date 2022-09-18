package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class PlasticStraw extends GamePiece implements Moveable, Drawable {
    /**
     * Constructor for the game piece
     *
     * @param symbol   symbol for the game piece
     * @param label    TODO
     * @param location initial location
     */
    public PlasticStraw(char symbol, String label, int location) {
        super(symbol, label, location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        //moves randomly
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return null;
    }
}
