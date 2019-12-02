package ua.epam2;

class Task4 {
    int[] getArrayPlusOne(int[] arr) {
        for (int i = arr.length - 1; i > -1; i--) {
            if (arr[i] != 9) {
                arr[i] += 1;
                return arr;
            } else if (arr[i] == 9) {
                arr[i] = 0;
                if (i == 0) {
                    int[] modifiedArr = new int[arr.length + 1];
                    modifiedArr[0] = 1;
                    return modifiedArr;
                }
            }
        }
        return arr;
    }
}