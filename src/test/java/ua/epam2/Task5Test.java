package ua.epam2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Task5Test {
    private Task5 test = new Task5();

    @Test
    public void isDuplicatedTest() {
        int[] arrTest = {1,2,3,1};
        boolean actualResult = true;
        assertEquals(test.isDuplicated(arrTest), actualResult);
    }

    @Test
    public void isDuplicatedTest2() {
        int[] arrTest = {1,2,3,4};
        boolean actualResult = false;
        assertEquals(test.isDuplicated(arrTest), actualResult);
    }

    @Test
    public void isDuplicatedTest3() {
        int[] arrTest = {1,1,1,3,3,4,3,2,4,2};
        boolean actualResult = true;
        assertEquals(test.isDuplicated(arrTest), actualResult);
    }
}