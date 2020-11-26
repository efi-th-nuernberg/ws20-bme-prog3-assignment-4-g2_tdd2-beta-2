import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act 1
        TriangleChecker.TriangleType type_1 = TriangleChecker.checkTriangle(a, b, c);

        // Assert 1
        assertEquals(TriangleChecker.TriangleType.NORMAL, type_1);

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

    @Test
    public void testIfNotValidTriangleWhenOneSideTooLong() {

        // Arrange
        float a = 70;
        float b = 1;
        float c = 1;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
     @Test
    public void testValidNoneSidesAreTooShort() {

        // Arrange
        float a = 81;
        float b = 75;
        float c = 73;
        
        // Act 1
        TriangleChecker.TriangleType type_1 = TriangleChecker.checkTriangle(a, b, c);
  
        // Assert 1
        assertEquals(TriangleChecker.TriangleType.NONE, type_1);
    }
    
    @Test
    public void testValidTriangleOneSideIsNull() {

        // Arrange
        float a = 0;
        float b = 20;
        float c = 20;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(a, b, c));
       
    }    
}
