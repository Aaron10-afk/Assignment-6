import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArenaJUnitTest {

    private Arena arena;

    @BeforeEach
    void setUp() {
        arena = new Arena("Blue", 100.0, 50.0);
    }

    @Test
    void testConstructorAndInitialValues() {
        assertEquals("Blue", arena.getColor(), "Initial color is incorrect.");
        assertEquals(100.0, arena.getLength(), 0.001, "Initial length is incorrect.");
        assertEquals(50.0, arena.getWidth(), 0.001, "Initial width is incorrect.");
        assertEquals("Arena", arena.getBuildingType(), "Initial building type is incorrect.");
    }

    @Test
    void testSetSize() {
        arena.setSize(120.0, 60.0);
        assertEquals(120.0, arena.getLength(), 0.001, "Length should update correctly.");
        assertEquals(60.0, arena.getWidth(), 0.001, "Width should update correctly.");
    }

    @Test
    void testSetColor() {
        arena.setColor("Red");
        assertEquals("Red", arena.getColor(), "Color should update correctly.");
    }

    @Test
    void testSetBuildingType() {
        arena.setBuildingType("Stadium");
        assertEquals("Stadium", arena.getBuildingType(), "Building type should update correctly.");
    }

    @Test
    void testToString() {
        String expected = "Arena (Color=Blue Length=100.0 Width=50.0 BuildingType=Arena)";
        assertEquals(expected, arena.toString(), "toString output is incorrect.");
    }
    
    
}
