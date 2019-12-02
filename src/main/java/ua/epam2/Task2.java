package ua.epam2;

class Task2 {
    int getModifiedLengthOfArray(int[] array, int number) {
        int index = 0, modifiedLength = array.length;
        while (index < modifiedLength) {
            if (array[index] == number) {
                array[index] = array[modifiedLength - 1];
                modifiedLength--;
            } else {
                index++;
            }
        }
        return modifiedLength;
    }
}
