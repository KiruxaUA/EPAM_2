package ua.epam2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Task2Test {
    private Task2 test = new Task2();

    @Test
    public void getNewLengthOfArrayTest() {
        int[] arrTest = {3,2,2,3};
        int value = 3;
        int lengthActual = 2;
        assertEquals(test.getModifiedLengthOfArray(arrTest, value), lengthActual);
    }

    @Test
    public void getNewLengthOfArrayTest2() {
        int[] arrTest = {0,1,2,2,3,0,4,2};
        int value = 2;
        int lengthActual = 5;
        assertEquals(test.getModifiedLengthOfArray(arrTest, value), lengthActual);
    }
}
