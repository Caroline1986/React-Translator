import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    private ArrayList<Device> devices;

    @Before
    public void setUp1() {
        this.devices = new ArrayList<>();
        // Run a DB backup
        // Clear your files
        this.devices.add(new Device());
        this.devices.add(new Device("Pixel 5"));
        this.devices.add(null);
    }

    @Test
    public void testIfInstanceIsNull() {
        assertNull(this.devices.get(2));
        assertNotNull(this.devices.get(0));
    }

    @Test
    public void testIfDeviceNameISPossible() {
        assertEquals("Pixel 5", this.devices.get(1).getName());
    }

    private List<String> names;

    @Before
    public void setUp() {
        this.names = new ArrayList<>();
        this.names.add("Fer");
    }

    @Test
    public void testIfNamesIsInitialized() {
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded() {
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }

    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

//    @Test
//    public void testIfObjectsAreDifferent() {
//        Object dog = new Object();
//        Object sheep = new Object();
//        Object clonnedSheep = sheep;
//
//        assertNotSame(sheep, dog);
//        assertSame(sheep, clonnedSheep);
//    }


    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfListsAreSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages,moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfBooleanWorksWithPHP(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
       assertFalse(language.contains("J")); // use assertFalse for this statement

    }
//    @Test
//    public void testIfInstanceIsNull() {
//        Device phone = new Device();
//        Device laptop = null;
//        assertNull(null);
//        assertNotNull(phone);
//    }


}
