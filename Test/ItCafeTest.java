import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ItCafeTest {

    @Test
    public void testComputerBookingOptionOutOfRange() {
        ItCafe itCafe = new ItCafe();


        String input = "4\n"; // Simulate user input: 4 and then Enter
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(ArithmeticException.class, itCafe::ComputerBooking);


    }

}

