package opgave03;

public class Main {
    public static void main(String[] args) {
        double[][] numbers = {
                {2, 17, 23, 0},
                {34, 12, 41, -17},
                {1, 2, 3, 4},
                {7, 9, 2, 6}
        };

        System.out.println("The smallest int is located at: ");
        for (int i : locateSmallest(numbers)) {
            System.out.print(i + " ");
        }
    }

    public static int[] locateSmallest(double[][] a) {
        double minValue = Double.MAX_VALUE;
        int[] locationOfSmallest = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                double temp = a[i][j];
                if (temp < minValue) {
                    minValue = temp;
                    locationOfSmallest[0] = i;
                    locationOfSmallest[1] = j;
                }
            }
        }
        return locationOfSmallest;
    }
}
