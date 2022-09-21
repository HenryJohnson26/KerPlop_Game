package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class WrongName extends GamePiece implements Drawable {
    /**
     * Constructor for the game piece
     *
     * @param symbol   symbol for the game piece
     * @param label    TODO
     * @param location initial location
     */
    //number of turns taken close to wrong name
    private int time = 0;
    public WrongName(char symbol, String label, int location) {
        super(symbol, label, location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        //kills if you spend three turns close to it
        if(Math.abs(getLocation()-playerLocation)==1){
            time ++;
        }
        if(time>=3){
        	
            return InteractionResult.KILL;
        }
        return InteractionResult.NONE;
    }

}
