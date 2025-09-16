import static org.junit.Assert.*;
import org.junit.Test;

public class DemoTest {

    @Test
    public void testIsTriangle_1() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void testIsTriangle_2() {
        assertTrue(Demo.isTriangle(5, 12, 13));
    }

    @Test
    public void test_is_triangle_3() {
        assertTrue(Demo.isTriangle(5, 13, 12));
    }

    @Test
    public void test_is_triangle_4() {
        assertTrue(Demo.isTriangle(12, 5, 13));
    }

    @Test
    public void test_is_triangle_5() {
        assertTrue(Demo.isTriangle(12, 13, 5));
    }

    @Test
    public void test_is_NOT_triangle_1() {
        assertFalse(Demo.isTriangle(5, 7, 13));
    }

    @Test
    public void test_is_NOT_triangle_2() {
        assertFalse(Demo.isTriangle(5, 13, 7));
    }

    @Test
    public void test_is_NOT_triangle_3() {
        assertFalse(Demo.isTriangle(13, 5, 7));
    }

    @Test
    public void test_is_NOT_triangle_4() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void test_is_NOT_triangle_5() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void Test_is_NOT_triangle_1() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void Test_is_NOT_triangle_2() {
        assertFalse(Demo.isTriangle(5, 13, 7));
    }

    @Test
    public void Test_is_NOT_triangle_3() {
        assertFalse(Demo.isTriangle(13, 5, 7));
    }

    @Test
    public void Test_is_NOT_triangle_4() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void Test_is_NOT_triangle_5() {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void test_is_NOT_triangle_6() {
        // ...just no...
        assertFalse(Demo.isTriangle(1, 2, -1));
    }

    // Testinh what happens in the terminal as output and input
    @Test
    public void test_main_program_1() throws Exception {
        java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        String sep = System.lineSeparator();
        String consoleOutput = "Enter side 1: " + sep;
        consoleOutput += "Enter side 2: " + sep;
        consoleOutput += "Enter side 3: " + sep;
        consoleOutput += "This is a triangle" + sep;

        Demo.main(new String[] {}); // this is the main method that we want to test

        assertEquals(consoleOutput, out.toString());

    }

}
