package opgave04.models;

import java.util.ArrayList;

public class TheaterFloor {
    int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
            { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
            { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

    /**
     * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
     * Der returneres false hvis pladsen er optaget.
     *
     * @param row
     * @param seat
     * @return
     */

    public boolean buySeat(int row, int seat) {
        if (seats[row - 1][seat - 1] != 0) {
            seats[row - 1][seat - 1] = 0;
            return true;
        }
        return false;
    }

    /**
     * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
     * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
     * til den pågældende pris.
     *
     * @param price
     * @return
     */
    public boolean buySeat(int price) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == price) {
                    seats[i][j] = 0;
                    return true;
                }
            }
        }
        return false;
    }

    public void printTheaterFloor() {
        System.out.println("De ledige pladser er angivet med deres pris");
        System.out.printf("%11s", "Sæde  :");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5s", i);
        }
        System.out.println();
        System.out.println("              -----------------------------------------------");
        for (int i = 0; i < seats.length; i++) {
            System.out.printf("%11s", "Række " + (i + 1) + "  :");
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] != 0) {
                    System.out.printf("%5s", seats[i][j]);
                } else {
                    System.out.printf("%5s", "--");
                }
            }
            System.out.println();
        }
    }
}

