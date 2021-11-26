// Input1 Size of chess Board, input2 row, input 3 column 
// 4 ==> 4*4 chess size , row,col starting position of chess
import java.util.*;

public class Knight_tour {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] chess = new int[size][size];
        printKnightsTour(chess, r, c, 1); // 1st position pe khdei h to vo move
        scn.close();
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        // two types base case
        // 1st negative base case
        if (r<0 || c<0 || r>=chess.length || c >= chess.length || chess[r][c]!=0){
            return;
        }
        else if (upcomingMove == chess.length*chess.length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = upcomingMove;
        printKnightsTour(chess, r-2, c+1, upcomingMove+1);
        printKnightsTour(chess, r-1, c+2, upcomingMove+1);
        printKnightsTour(chess, r+1, c+2, upcomingMove+1);
        printKnightsTour(chess, r+2, c+1, upcomingMove+1);
        printKnightsTour(chess, r+2, c-1, upcomingMove+1);
        printKnightsTour(chess, r+1, c-2, upcomingMove+1);
        printKnightsTour(chess, r-1, c-2, upcomingMove+1);
        printKnightsTour(chess, r-2, c-1, upcomingMove+1);
        chess[r][c] = 0; // visisted array ko hi lekr chl rhe h
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}