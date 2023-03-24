import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Travella Tictactoe!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String playerName = scanner.next();
        Player player = new Player(playerName);

        System.out.println("Hello " + player.getPlayer() + ", Enter difficulty level: \n(1.) Weak AI\n(2.) Intelligent AI ");
        int difficultyLevel = scanner.nextInt();

        if (difficultyLevel == 1) {
            System.out.println("Hello " + playerName + ", the difficulty level you chose is weak AI!");
        } else if(difficultyLevel == 2) {
            System.out.println("Hello " + playerName + ", the difficulty level you chose is intelligent AI!");
        } else {
            System.out.println("Invalid option!");
        }

        System.out.println("Choose your symbol, X or O: ");
        String symbol = scanner.next();

        if (symbol.toUpperCase().equals("X")) {
            System.out.println("Hello " + playerName + " you play X");
        } else if (symbol.toUpperCase().equals("O")) {
            System.out.println("Hello " + playerName + " you play O");
        } else {
            System.out.println("Invalid option!");
        }

        System.out.println("Would you like to play first, Y/N? ");
        String firstChoice = scanner.next();

        if (firstChoice.toUpperCase().equals("Y")) {
            System.out.println("Hello " + playerName + " you play first");
        } else if (firstChoice.toUpperCase().equals("N")) {
            System.out.println("Hello " + playerName + " the computer plays first");
        }

        System.out.println("------- Now the game begins --------");

    }
}