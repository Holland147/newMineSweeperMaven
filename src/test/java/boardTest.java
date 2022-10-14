import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class boardTest {
    board testBoard = new board(9);

    @Test
    public void testGrid(){
        Assertions.assertEquals(9, testBoard.gridSize, "check if 9");
        Assertions.assertEquals(15, testBoard.totalNumMines, "check if 15");
        Assertions.assertEquals(9, testBoard.grid.length, "Check length of array");


    }
}
