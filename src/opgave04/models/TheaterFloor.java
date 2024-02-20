package opgave04.models;

public class TheaterFloor {
    private Seat[][] seats;

    public void print() {

    }

    public Seat[][] findAvaiableSeatsAtPrice(int price) {
        return null;
    }

    public void makeReservation(Seat[] seats) {

    }

    public TheaterFloor() {
        seats = new Seat[8][10];
        for (Seat seat : seats[0]) {
            seat = new Seat(10);
        }
        for (Seat seat : seats[1]) {
            seat = new Seat(10);
        }

        seats[2][0] = new Seat(10);
        seats[2][1] = new Seat(10);
        seats[2][2] = new Seat(20);
        seats[2][3] = new Seat(20);
        seats[2][4] = new Seat(20);
        seats[2][5] = new Seat(20);
        seats[2][6] = new Seat(20);
        seats[2][8] = new Seat(10);
        seats[2][9] = new Seat(10);

        seats[3][0] = new Seat(10);
        seats[3][1] = new Seat(10);
        seats[3][2] = new Seat(20);
        seats[3][3] = new Seat(20);
        seats[3][4] = new Seat(20);
        seats[3][5] = new Seat(20);
        seats[3][6] = new Seat(20);
        seats[3][7] = new Seat(20);
        seats[3][8] = new Seat(10);
        seats[3][9] = new Seat(10);

        seats[4][0] = new Seat(10);
        seats[4][1] = new Seat(10);
        seats[4][2] = new Seat(20);
        seats[4][3] = new Seat(20);
        seats[4][4] = new Seat(20);
        seats[4][5] = new Seat(20);
        seats[4][6] = new Seat(20);
        seats[4][7] = new Seat(20);
        seats[4][8] = new Seat(10);
        seats[4][9] = new Seat(10);

        seats[5][0] = new Seat(20);
        seats[5][1] = new Seat(20);
        seats[5][2] = new Seat(30);
        seats[5][3] = new Seat(30);
        seats[5][4] = new Seat(40);
        seats[5][5] = new Seat(40);
        seats[5][6] = new Seat(30);
        seats[5][7] = new Seat(30);
        seats[5][8] = new Seat(20);
        seats[5][9] = new Seat(20);

        seats[6][0] = new Seat(20);
        seats[6][1] = new Seat(30);
        seats[6][2] = new Seat(30);
        seats[6][3] = new Seat(30);
        seats[6][4] = new Seat(40);
        seats[6][5] = new Seat(50);
        seats[6][6] = new Seat(40);
        seats[6][7] = new Seat(30);
        seats[6][8] = new Seat(30);
        seats[6][9] = new Seat(20);

        seats[7][0] = new Seat(30);
        seats[7][1] = new Seat(40);
        seats[7][2] = new Seat(50);
        seats[7][3] = new Seat(50);
        seats[7][4] = new Seat(50);
        seats[7][5] = new Seat(50);
        seats[7][6] = new Seat(50);
        seats[7][7] = new Seat(50);
        seats[7][8] = new Seat(40);
        seats[7][9] = new Seat(30);
    }
}
