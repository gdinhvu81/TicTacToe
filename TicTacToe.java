import javax.swing.*;

class TicTacToe extends JFrame{
    // Creates a panel object to add to the window
    JPanel panel = new JPanel();

    // Create gameboard
    public static String[][] gameBoard = {{" ", "|", " ", "|", " "},
                            {"-", "+", "-", "+", "-"},
                            {" ", "|", " ", "|", " "},
                            {"-", "+", "-", "+", "-"},
                            {" ", "|", " ", "|", " "}};     

    // Constructor for the game
    public TicTacToe(){
        super("Tic Tac Toe Game!");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(panel);



    }
    public static void main(String[]args){
        // Creates the window.
        TicTacToe gui = new TicTacToe();
        
    }

    // Method to print gameBoard 
    public static void drawBoard(){
        for(int row = 0; row < gameBoard.length; row++){
            for(int col = 0; col < gameBoard.length; col++){
                System.out.print(gameBoard[row][col]);
            }
            System.out.println();
        }
    }
}