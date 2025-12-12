import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AcrobaticJUnitTest {

    @Test
    public void testConstructorAndInheritedGetters() {
        // Create an instance of Acrobatic
        Acrobatic acrobatic = new Acrobatic("Nathan Rick", 28, 5, "Gymnastics Artist");

        // Test inherited fields and getters
        assertEquals("Nathan Rick", acrobatic.getName());
        assertEquals(28, acrobatic.getAge());
        assertEquals(5, acrobatic.getYearsWorked());
        assertEquals("Gymnastics Artist", acrobatic.getJob());
    }

    @Test
    public void testToString() {
        Acrobatic acrobatic = new Acrobatic("Alice Brown", 35, 12, "Fire Breather");
        String expected = "Name: Alice Brown\nAge: 35\nYears Worked: 12\nJob: Fire Breather";
        assertEquals(expected, acrobatic.toString());
    }

}
