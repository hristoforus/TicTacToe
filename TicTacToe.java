/*
*
*
*   Console version of TicTacToe game
*
*
* */

public class TicTacToe {

    public static void show (String arr[][]) { // method for game board

        for (int i = 0; i < arr.length; i++) {
           for (int a = 0; a < arr[i].length; a++) {
               if (arr[i][a] == null) {arr[i][a] = " ";}

               if (a == 1) System.out.print(" | " + arr[i][a] + " | ");
               else System.out.print(arr[i][a]);
           }

           if (i == 2) break;

           System.out.println();
           System.out.println("---------");
        }
    }

    public static void turn (String arr[][] , int turn) { // method for make a move

        int xRow = 0, xColumn = 0; // coordinates
        int yRow = 0, yColumn = 0; // coordinates

        while (true) {
            if (turn % 2 != 0) {
                System.out.print("Player X, enter the row[1-3]");
                xRow = Input.readInt();
                System.out.print("Player X, enter the column[1-3]");
                xColumn = Input.readInt();
            } else {
                System.out.print("Player O, enter the row[1-3]");
                yRow = Input.readInt();
                System.out.print("Player O, enter the column[1-3]");
                yColumn = Input.readInt();
            }

            if (xRow+xColumn >= 2 && xRow+xColumn <= 6 || yRow+yColumn >= 2 && yRow+yColumn <= 6) {
                if (xRow+xColumn >= 2 && xRow+xColumn <= 6) {
                    if ("X".equals(arr[xRow-1][xColumn-1]) || "O".equals(arr[xRow-1][xColumn-1])) {
                        System.out.println("Error! You have entered incorrect coordinates. Try again");
                    }
                    else break;
                }
                else {
                    if ("X".equals(arr[yRow-1][yColumn-1]) || "O".equals(arr[yRow-1][yColumn-1])) {
                        System.out.println("Error! You have entered incorrect coordinates. Try again");
                    }
                    else break;
                }
            }
            else {
                System.out.println("Error! You have entered incorrect coordinates. Try again");
            }

        }

        if (turn%2 != 0) arr[xRow-1][xColumn-1] = "X";
        else arr[yRow-1][yColumn-1] = "O";

        show(arr);

    }

    public  static int comparison (String[][] arr , int turn) { // Who has won(comparison)
        String sing;
        int count = 0;
        if (turn%2 != 0) sing = "X";
        else sing = "O";
        if (sing.equals(arr[0][0]) && sing.equals(arr[0][1]) && sing.equals(arr[0][2]) ||
            sing.equals(arr[1][0]) && sing.equals(arr[1][1]) && sing.equals(arr[1][2]) ||
            sing.equals(arr[2][0]) && sing.equals(arr[2][1]) && sing.equals(arr[2][2]) ||
            sing.equals(arr[0][1]) && sing.equals(arr[1][0]) && sing.equals(arr[2][0]) ||
            sing.equals(arr[0][1]) && sing.equals(arr[1][1]) && sing.equals(arr[2][1]) ||
            sing.equals(arr[0][2]) && sing.equals(arr[1][2]) && sing.equals(arr[2][2]) ||
            sing.equals(arr[0][0]) && sing.equals(arr[1][1]) && sing.equals(arr[2][2]) ||
            sing.equals(arr[0][2]) && sing.equals(arr[1][1]) && sing.equals(arr[2][0])) {
            count = 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String[][] a = new String[3][3]; // board
        int turn = 1; // change a move
        String sign; // winner sign

        do {

            if (turn == 10) {
                System.out.println();
                System.out.println("Draw!");
                break;
            }

            if (turn%2 != 0) {
                System.out.println();
                turn(a , turn);
            }
            else {
                System.out.println();
                turn(a , turn);
            }


            if (comparison(a , turn) == 1) {

                if (turn%2 != 0) sign = "X";
                else sign = "O";

                System.out.println();
                System.out.println("Player " + sign + " has won!");
                break;
            }

            turn++;
        }
        while (true);





    }
}
