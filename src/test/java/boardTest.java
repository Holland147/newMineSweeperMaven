import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class boardTest {
    board testBoard = new board(9);

    @Test
    public void testGrid(){
        Assertions.assertEquals(9, testBoard.gridSize, "check if 9");
    }
}
