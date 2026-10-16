package se.iths.sebastian.parprogramering.ovning;

public class Main {
    static void main() {

        String libaryName = "Stora Bibloteket";
        int borrowedBookCount = 8;
        int bookCount = 12;
        int availableBookCount = bookCount - borrowedBookCount;

        IO.println("Böcker som blir kvar: " + availableBookCount);

        String firstName = "Fredrik";
        String lastName = "Klint";
        String fullName = firstName + " " + lastName;

        IO.println("Välkommen " + fullName + " till " + libaryName);

    }
}
