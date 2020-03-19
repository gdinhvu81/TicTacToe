import java.util.Scanner;

class TicTacToe{
    // Create gameboard
    public static char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                                        {'-', '+', '-', '+', '-'},
                                        {' ', '|', ' ', '|', ' '},
                                        {'-', '+', '-', '+', '-'},
                                        {' ', '|', ' ', '|', ' '}};  
    public static void main(String[]args){
        // Creates a scanner for user input
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Player 1 starts: Press 1-9.");
        int player1 = scan.nextInt();
        
        switch(player1){
            case 1: gameBoard[0][0] = 'X';
                break;
            case 2: gameBoard[0][2] = 'X';
                break;
            case 3: gameBoard[0][4] = 'X';
                break;
            case 4: gameBoard[2][0] = 'X';
                break;
            case 5: gameBoard[2][2] = 'X';
                break;
            case 6: gameBoard[2][4] = 'X';
                break;
            case 7: gameBoard[4][0] = 'X';
                break;
            case 8: gameBoard[4][2] = 'X';
                break;
            case 9: gameBoard[4][4] = 'X';
                break;
        }

        drawBoard();
        System.out.println("Player 2 turn: Press 1-9.");
        int player2 = scan.nextInt(); 

        switch(player2){
            case 1: gameBoard[0][0] = 'O';
                break;
            case 2: gameBoard[0][2] = 'O';
                break;
            case 3: gameBoard[0][4] = 'O';
                break;
            case 4: gameBoard[2][0] = 'O';
                break;
            case 5: gameBoard[2][2] = 'O';
                break;
            case 6: gameBoard[2][4] = 'O';
                break;
            case 7: gameBoard[4][0] = 'O';
                break;
            case 8: gameBoard[4][2] = 'O';
                break;
            case 9: gameBoard[4][4] = 'O';
                break;
        }
        drawBoard();
        scan.close();
        
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