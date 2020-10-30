import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);
        
    }

    @Test
    public void testValidEquilateralTriangle() {

        // Arrange
        float a = 3;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
    }

    @Test
    public void testValidIsoscelesTriangle() {

        // Arrange
        float a = 4;
        float b = 4;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testNoValidTriangle() {

        // Arrange
        float a = -1;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }
}
