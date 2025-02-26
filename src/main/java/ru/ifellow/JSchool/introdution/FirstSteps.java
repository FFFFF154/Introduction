package ru.ifellow.JSchool.introdution;


public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array) {
        if (array == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int mul(int[] array) {
        int mul = 1;
        if (array == null || array.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                mul *= array[i];
            }
            return mul;
        }
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array == null) {
            return min;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        if (array == null) {
            return max;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        } else {
            double sum = 0;
            for (int j : array) {
                sum += j;
            }
            return sum / array.length;
        }

    }

    public boolean isSortedDescendant(int[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] < array[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = mul(new int[]{array[i], array[i], array[i]});
        }
    }

    public boolean find(int[] array, int value) {
        if (array == null) {
            return false;
        }
        for (int j : array) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix) {
        int sumMatrix = 0;
        if (matrix == null) {
            return sumMatrix;
        }
        for (int i = 0; i < matrix.length; i++) {
            sumMatrix += sum(matrix[i]);
        }
        return sumMatrix;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (matrix == null) {
            return max;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (max < max(matrix[i])) {
                max = max(matrix[i]);
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (matrix == null) {
            return max;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (max < matrix[i][i]) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix == null) {
            return true;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) {
                return false;
            }
        }
        return true;
    }

}
