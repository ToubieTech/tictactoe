public class Game {
    // Data fields for the Game class:
    private char[][] board;

    // The game class constructor:
    public Game() {
        // Initialize the board data field and set it to a 2-dimensional 3 * 3 char array
        board = new char[3][3];
    }

    public void emptyBoard() {
        // Loop through the first array:
        for (int i = 0; i < board.length; i++) {
            // Loop through the second array:
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void displayBoard() {
        System.out.println("-----------------------------");
    }
}
