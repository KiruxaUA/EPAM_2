package ua.epam2;

class Task1 {
    int findContiguousSubarray(int[] arr) {
        int highestSum = 0, localSum;
        for (int i = 0; i < arr.length; i++) {
            localSum = 0;
            for (int j = i; j < arr.length; j++) {
                localSum += arr[j];
                if (localSum > highestSum) {
                    highestSum = localSum;
                }
            }
        }
        return highestSum;
    }
}
