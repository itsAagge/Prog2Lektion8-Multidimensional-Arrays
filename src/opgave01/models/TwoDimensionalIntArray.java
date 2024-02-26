package opgave01.models;

import java.util.Arrays;

public class TwoDimensionalIntArray {
    private int[][] intArray;

    public TwoDimensionalIntArray(int[][] intArray) {
        this.intArray = intArray;
    }

    public void setValueAt(int row, int column, int value) {
        intArray[row][column] = value;
    }

    public int getValueAt(int row, int column) {
        return intArray[row][column];
    }


    public int sumRow(int row) {
        int sum = 0;
        for (int i : intArray[row]) {
            sum += i;
        }
        return sum;
    }

    public int sumColumn(int column) {
        int sum = 0;
        for (int[] ints : intArray) {
            sum += ints[column];
        }
        return sum;
    }

    public int sumAll() {
        int sum = 0;
        for (int[] ints : intArray) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }

    public void print() {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println();
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("%5d",intArray[i][j]);
            }
        }
    }

    public void doubleAll() {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] *= 2;
            }
        }
    }

    public void map(IntFunction function) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = function.apply(intArray[i][j]);
            }
        }
    }


}
