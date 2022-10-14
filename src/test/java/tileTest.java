
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tileTest {

    Tile testTile = new Tile();


    @Test
    public void testGetBomb(){
        Assertions.assertEquals(false, testTile.getBomb(), "Check if False");
        testTile.setBomb();
        Assertions.assertEquals(true, testTile.getBomb(), "Check if setBomb works");
    }
    @Test
    public void testSetFlag(){
        Assertions.assertEquals(false, testTile.getFlag(), "check if false");
        testTile.setFlag();
        Assertions.assertEquals(true, testTile.getFlag(), "check if True");

    }





}
