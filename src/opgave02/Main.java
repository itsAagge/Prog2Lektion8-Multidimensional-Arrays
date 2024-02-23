package opgave02;

public class Main {
    public static void main(String[] args) {
        double[][] numbers = {
                {2, 17, 23, 0},
                {34, 12, 41, -17},
                {1, 2, 3, 4},
                {7, 9, 2, 6}
        };
        System.out.println(averageMajorDiagonal(numbers));
    }

    public static double averageMajorDiagonal(double[][] m) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
            count++;
        }
        return sum / count;
    }
}
