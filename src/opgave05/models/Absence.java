package opgave05.models;

public class Absence {
    private int[][] absenceSchema;

    public Absence(int[][] absenceSchema) {
        this.absenceSchema = absenceSchema;
    }

    public void print() {
        System.out.printf("%11s", "Måned  :");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%5s", i);
        }
        System.out.println();
        System.out.println("               --------------------------------------------------------");
        for (int i = 0; i < absenceSchema.length; i++) {
            System.out.printf("%11s", "Elev " + (i + 1) + "  :");
            for (int j = 0; j < absenceSchema[i].length; j++) {
                System.out.printf("%5s", absenceSchema[i][j]);
            }
            System.out.println();
        }
    }

    public int totalAbsence(int studentNumber) {
        int sum = 0;
        for (int i = 0; i < absenceSchema[studentNumber - 1].length; i++) {
            sum += absenceSchema[studentNumber - 1][i];
        }
        return sum;
    }

    public double average(int studentNumber) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < absenceSchema[studentNumber - 1].length; i++) {
            sum += absenceSchema[studentNumber - 1][i];
            count++;
        }
        return sum / count;
    }

    public int StudentsWithoutAbsence() {
        int studentsWithoutAbsence = 0;
        for (int i = 0; i < absenceSchema.length; i++) {
            if (totalAbsence(i + 1) == 0) {
                studentsWithoutAbsence++;
            }
        }
        return studentsWithoutAbsence;
    }

    public int mostAbsence() {
        int[] absence = new int[absenceSchema.length];
        for (int i = 0; i < absenceSchema.length; i++) {
            absence[i] = totalAbsence(i + 1);
        }
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < absence.length; i++) {
            if (absence[i] > max) {
                max = absence[i];
                temp = i;
            }
        }
        return temp + 1;
    }

    public void reset(int studentNumber) {
        for (int i = 0; i < absenceSchema[studentNumber - 1].length; i++) {
            absenceSchema[studentNumber - 1][i] = 0;
        }
    }
}
