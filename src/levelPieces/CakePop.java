package levelPieces;

import gameEngine.Drawable;

public class CakePop implements Drawable {
    private char symbol;
    private int location;
    public CakePop(char symbol, int location){
        this.symbol = symbol;
        this.location = location;
    }
    @Override
    public void draw() {
        System.out.print(symbol);
    }
    public int getLocation(){
        return location;
    }
}
