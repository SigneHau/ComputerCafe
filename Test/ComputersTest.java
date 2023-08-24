import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputersTest {

    @Test
    public void testGetAvailable() {
        // Forbered
        Computers computers = new Computers(); // Opret en instans af klassen
        computers.BookComputer(2); //Booker computer nummer 3
        ArrayList<Integer> expectedAvailable = new ArrayList<>();
        expectedAvailable.add(1);
        expectedAvailable.add(3);
        expectedAvailable.add(4);
        expectedAvailable.add(5);

        // Handling
        ArrayList<Integer> availableList = computers.getAvailable();

        // Verificer
        assertEquals(expectedAvailable,availableList ); // Sammenlign forventede og faktiske tilgængelige computere
    }
}