package ua.epam2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task3Test {
    private Task3 test = new Task3();

    @Test
    public void getIndicesOfAddedElementsTest() {
        int[] arrTest = {2, 7, 11, 15};
        int target = 9;
        int[] indexesActual = {0, 1};
        assertArrayEquals(test.getIndicesOfAddedElements(arrTest, target), indexesActual);
    }
}
