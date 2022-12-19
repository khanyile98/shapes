package project.shapes;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestShapes {
    private static Shapes shape = new Shapes();
    private static ShapeOutlines outlines = new ShapeOutlines();

    @Test
    public void testSquare(){
        String expected = "*****\n*****\n*****\n*****\n*****";

        boolean test = (expected).equals(shape.square(5));
        assertTrue(test);
    }

    @Test
    public void testPyramid(){
        String expected = "    *\n   ***\n  *****\n *******\n*********";

        boolean test = expected.equals(shape.pyramid(5));
        assertTrue(test);
    }

    @Test
    public void testTriangle(){
        String expected = "*\n**\n***\n****\n*****";
        boolean test = (expected).equals(shape.triangle(5));

        assertTrue(test);
    }

    @Test
    public void testSquareOutline(){
        String expected = "*****\n*   *\n*   *\n*   *\n*****";

        boolean test = (expected).equals(outlines.square(5));
        assertTrue(test);
    }

    @Test
    public void testPyramidOutline(){
        String expected = "    *\n   * *\n  *   *\n *     *\n*********";

        boolean test = expected.equals(outlines.pyramid(5));
        assertTrue(test);
    }

    @Test
    public void testTriangleOutline(){
        String expected = "*\n**\n* *\n*  *\n*****";
        boolean test = (expected).equals(outlines.triangle(5));

        assertTrue(test);
    }
}
