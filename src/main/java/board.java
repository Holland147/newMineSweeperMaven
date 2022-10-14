import java.util.Random;
import java.util.Scanner;

public class board {
    //attributes
    Tile[][] grid;
    int gridSize;
    int totalNumMines;
    int numOfFlags;

    boolean win;

    public static final Scanner scanner = new Scanner(System.in);


    //constructor
    public board(int gridSize) {
        this.gridSize = gridSize;
        this.grid = new Tile[gridSize][gridSize];
        this.totalNumMines = 15;
        setTiles();
        setBombs();
        //set counters
        //start game
        //makeBoard();
        //checkIfHitBomb();
    }

    //method
    public void makeBoard() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                System.out.print(grid[i][j].bombCounter);
            }
            System.out.println("");
        }


    }

    public void checkIfHitBomb() {
        System.out.print("Enter the X and Y axis individually");

        int xValue = scanner.nextInt();
        int yValue = scanner.nextInt();


        if (grid[xValue][yValue].getBomb()) {
            win = false;
        } else {
            win = true;
        }

    }




    public boolean getWin(){
        return win;
    }

    public void setTiles(){

        for(int i = 0; i<gridSize; i++){
            for(int j = 0; j<gridSize; j++){
                grid[i][j] = new Tile();
            }

        }
    }

    public void setBombs(){
        Random random = new Random();
        for(int i = 0; i < totalNumMines; i++){
            int X = random.nextInt(gridSize);
            int Y = random.nextInt(gridSize);
            while (grid[X][Y].getBomb()){
                X = random.nextInt(gridSize);
                Y = random.nextInt(gridSize);
            }
            grid[X][Y].setBomb();
            setNumOfNearbyBombs(X,Y);
        }
    }



    public void setFlag(int flagX, int flagY){
        grid[flagX][flagY].setFlag();

    }

    public void setNumOfNearbyBombs(int X, int Y) {

        handleEdge(X - 1,Y - 1);
        handleEdge(X - 1, Y);
        handleEdge(X - 1, Y+1);
        handleEdge( X , Y+1);
        handleEdge(X, Y-1);
        handleEdge(X + 1, Y +1);
        handleEdge(X + 1, Y);
        handleEdge(X + 1, Y - 1);



    }

    private void handleEdge(int X, int Y){
        if(X < 0){
            return;
        }

        if(X >= gridSize ){
            return;
        }

        if(Y >= gridSize){
            return;
        }
        if(Y < 0){
            return;
        }
        grid[X][Y].bombCounter++;
    }



    }


