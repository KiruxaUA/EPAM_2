package ua.epam2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task4Test {
    private Task4 test = new Task4();

    @Test
    public void getArrayPlusOneTest() {
        int[] arrTest = {1,2,3};
        int[] actualResult = {1,2,4};
        assertArrayEquals(test.getArrayPlusOne(arrTest), actualResult);
    }

    @Test
    public void getArrayPlusOneTest2() {
        int[] arrTest = {4, 3, 2, 1};
        int[] actualResult = {4,3,2,2};
        assertArrayEquals(test.getArrayPlusOne(arrTest), actualResult);
    }
}
