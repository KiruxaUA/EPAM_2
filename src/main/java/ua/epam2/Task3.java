package ua.epam2;

class Task3 {
    int[] getIndicesOfAddedElements(int[] arr, int target) {
        int[] resultIndexes = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    resultIndexes[0] = i;
                    resultIndexes[1] = j;
                }
            }
        }
        return resultIndexes;
    }
}
