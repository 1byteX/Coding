import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class junit {
    @Test
    public void test1() {
        programm programm = new programm();
        String test = programm.calculate("hallo", "john");
        assertEquals(test, "hallojohn");
    }
}