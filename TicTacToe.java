import java.util.Scanner;

class TicTacToe{
    // Create player variables
    static int player1, player2;

    // Create gameboard
    static char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                                 {'-', '+', '-', '+', '-'},
                                 {' ', '|', ' ', '|', ' '},
                                 {'-', '+', '-', '+', '-'},
                                 {' ', '|', ' ', '|', ' '}};  
    public static void main(String[]args){
        // Creates a scanner for user input
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        // Loops players to select spot until all empty spaces are taken
        while(counter < 9){     // 9 because there are only 9 spots on the board
            System.out.println("Player 1 starts: Press 1-9.");
            player1 = scan.nextInt();
        
            // Creates an 'X' for player1 on the board based player1 input
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
            checkWin();
            counter++;

            // As long as there are still spaces on the board, player2 gets to go.
            while(counter < 9){
                System.out.println("Player 2 turn: Press 1-9.");
                player2 = scan.nextInt(); 

                // Creates an 'O' on the board based on player2 input
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
                checkWin();
                counter++;
                break;
            }
        }
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

    // Method to check if player wins.
    public static void checkWin(){
        if((gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') ||  // Checks if 'X' is in 1,2,3 positions
           (gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') ||  // Checks if 'X' is in 1,5,9 positions
           (gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X') ||  // Checks if 'X' is in 1,4,7 positions
           (gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X') ||  // Checks if 'X' is in 2,5,8 positions
           (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X') ||  // Checks if 'X' is in 3,5,7 positions
           (gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X') ||  // Checks if 'X' is in 3,6,9 positions
           (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') ||  // Checks if 'X' is in 4,5,6 positions
           (gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X')){   // Checks if 'X' is in 7,8,9 positions
            System.out.println("Player1 Wins");
            System.exit(); 
        }
        else if((gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') ||  // Checks if 'O' is in 1,2,3 positions
                (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O') ||  // Checks if 'O' is in 1,5,9 positions
                (gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O') ||  // Checks if 'O' is in 1,4,7 positions
                (gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O') ||  // Checks if 'O' is in 2,5,8 positions
                (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O') ||  // Checks if 'O' is in 3,5,7 positions
                (gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O') ||  // Checks if 'O' is in 3,6,9 positions
                (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') ||  // Checks if 'O' is in 4,5,6 positions
                (gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O')){   // Checks if 'O' is in 7,8,9 positions
                System.out.println("Player2 Wins");
        }
        else return;
    }
}