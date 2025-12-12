import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketingOfficeJUnitTest {

    private TicketingOffice office;

    @BeforeEach
    void setUp() {
        office = new TicketingOffice("Blue", 100.0, 50.0);
    }

    @Test
    void testConstructorAndInitialValues() {
        assertEquals("Blue", office.getColor(), "Initial color is incorrect.");
        assertEquals(100.0, office.getLength(), 0.001, "Initial length is incorrect.");
        assertEquals(50.0, office.getWidth(), 0.001, "Initial width is incorrect.");
        assertEquals("Ticketing Office", office.getBuildingType(), "Initial building type is incorrect.");
    }

    @Test
    void testSetSize() {
        office.setSize(120.0, 60.0);
        assertEquals(120.0, office.getLength(), 0.001, "Length should update correctly.");
        assertEquals(60.0, office.getWidth(), 0.001, "Width should update correctly.");
    }

    @Test
    void testSetColor() {
        office.setColor("Red");
        assertEquals("Red", office.getColor(), "Color should update correctly.");
    }

    @Test
    void testSetBuildingType() {
        office.setBuildingType("Stadium");
        assertEquals("Stadium", office.getBuildingType(), "Building type should update correctly.");
    }

    @Test
    void testToString() {
    	String expected = "Ticketing Office (Color=Blue Length=100.0 Width=50.0 BuildingType=Ticketing Office)";
        assertEquals(expected, office.toString(), "toString output is incorrect.");
    }  
    
}
