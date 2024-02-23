package opgave04;

import opgave04.models.TheaterFloor;

import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {
        TheaterFloor theaterFloor = new TheaterFloor();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hvad vi du gøre? (1 køb plads med pris), (2 køb specifik plads), (3 se alle pladser), (4 for at afslutte)");
        int answer = scan.nextInt();
        while (answer != 4) {
            switch (answer) {
                case 1 -> købPladsMedPris(theaterFloor, scan);
                case 2 -> købSpecifikPlads(theaterFloor, scan);
                case 3 -> printTeater(theaterFloor);
            }
            System.out.println("Hvad vi du gøre? (1 køb plads med pris), (2 køb specifik plads), (3 se alle pladser), (4 for at afslutte)");
            answer = scan.nextInt();
        }
    }

    private static void købPladsMedPris(TheaterFloor theaterFloor, Scanner scan) {
        System.out.println("Hvor meget vil du give for pladsen?");
        int pladsPris = scan.nextInt();
        Boolean seatBought = theaterFloor.buySeat(pladsPris);
        if (seatBought) {
            System.out.println("Du har reserveret pladsen");
        } else {
            System.out.println("Beklager, pladsen er allerede reserveret");
        }
    }

    private static void købSpecifikPlads(TheaterFloor theaterFloor, Scanner scan) {
        System.out.println("Hvilken plads kunne du tænke dig?");
        int pladsX = scan.nextInt();
        int pladsY = scan.nextInt();
        Boolean seatBought = theaterFloor.buySeat(pladsX, pladsY);
        if (seatBought) {
            System.out.println("Du har reserveret pladsen");
        } else {
            System.out.println("Beklager, pladsen er allerede reserveret");
        }
    }

    private static void printTeater(TheaterFloor theaterFloor) {
        theaterFloor.printTheaterFloor();
    }
}
