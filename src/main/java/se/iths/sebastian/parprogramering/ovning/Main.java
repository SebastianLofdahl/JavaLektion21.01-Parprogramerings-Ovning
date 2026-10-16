package se.iths.sebastian.parprogramering.ovning;

public class Main {
    static void main() {

        int borrowedBookCount = 8;
        int bookCount = 12;
        int availableBookCount = bookCount - borrowedBookCount;

        IO.println("Böcker som blir kvar: " + availableBookCount);

    }
}
