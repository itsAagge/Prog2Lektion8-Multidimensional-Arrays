package opgave05;

import opgave05.models.Absence;

public class Opgave05 {
    public static void main(String[] args) {
        int[][] a = {
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 },
                { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
                { 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0 }
        };
    Absence absence = new Absence(a);
    absence.print();
    System.out.println("Total fravær for student 5: " + absence.totalAbsence(5));
    System.out.println("Gennemsnitligt fravær for student 5: " + absence.average(5));
    System.out.println("Antal studerende uden fravær: " + absence.StudentsWithoutAbsence());
    System.out.println("Elev med mest fravær: " + absence.mostAbsence());
    System.out.println("Reset fravær for elev 5");
    absence.reset(5);
    absence.print();
    }

}
