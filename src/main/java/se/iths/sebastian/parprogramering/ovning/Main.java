package se.iths.sebastian.parprogramering.ovning;

public class Main {
    static void main() {

        String libaryName = "Stora Bibloteket";
        int borrowedBookCount = 4;
        int bookCount = 12;
        int availableBookCount = bookCount - borrowedBookCount;

        boolean isOpen = false;

        IO.println("Böcker som blir kvar: " + availableBookCount);

        String firstName = "Fredrik";
        String lastName = "Klint";
        String fullName = firstName + " " + lastName;

        IO.println("Välkommen " + fullName + " till " + libaryName);

        if (isOpen == true) {
            IO.println("Det är öppet!");
        } else {
            IO.println("Det är stängt!");
        }

        if (availableBookCount <= 0) {
            IO.println("Alla böcker är slut");
        } else if (availableBookCount >= 1 && availableBookCount <= 3) {
            IO.println("Det är nästan slut på böcker");
        } else {
            IO.println("Det finns böcker kvar");
        }
    }
}
