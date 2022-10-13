public class Tile {
    //attributes
    int bombCounter;
    boolean tileRevealed;
    boolean isBomb;
    boolean isFlag;

    boolean isWin;




    //constructior

    public Tile(){
        this.tileRevealed = false;
        this.isFlag = false;
        this.isBomb = false;
        this.isWin = false;
    }
    //methods
    public void setBombCounter(int numBombs){
        this.bombCounter = numBombs;
    }

    public int getBombCounter(){
        return bombCounter;
    }

    public void setBomb(){
        this.isBomb = true;
    }

    public boolean getBomb() {
        return isBomb;
    }
    public void setFlag(){
        this.isFlag = !this.isFlag;
    }

    public boolean getFlag(){
        return isFlag;
    }
    public boolean isTileRevealed(){
        return tileRevealed;
    }
}
