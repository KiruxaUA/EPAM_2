package ua.epam2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Task1Test {

    private Task1 task1 = new Task1();

    @Test
    public void findContiguousSubarrayTest() {
        int[] arrTest = {-2,1,-3,4,-1,2,1,-5,4};
        int sumActual = 6;
        assertEquals(task1.findContiguousSubarray(arrTest), sumActual);
    }
}
