package model;

public class board {

   private chess_piece[] cp = new chess_piece[32];
    // diff ID of black and white pieces
  private  int[] a = {0, 16}; // 0 to 16 black   16 to 32 white
  private boolean turn = false ;
    // state of game  false - > game is on     true - > game ended
    boolean en = false ;
    // board of IDs
  private  int [][] b = {
            {0, 1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14, 15},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {24, 25, 26, 27, 28, 29, 30, 31},
            {16, 17, 18, 19, 20, 21, 22, 23}
    };
   private char[][] board_piece_type ={
            {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
    };

    // right types on cp    and    building their position
   {
        for (int i = 0; i < 2; i++) {

            cp[0 + a[i]] = new rook(0 + a[i]);
            cp[1 + a[i]] = new n_knight(1 + a[i]);
            cp[2 + a[i]] = new bishop(2 + a[i]);
            cp[3 + a[i]] = new queen(3 + a[i]);
            cp[4 + a[i]] = new king(4 + a[i]);
            cp[5 + a[i]] = new bishop(5 + a[i]);
            cp[6 + a[i]] = new n_knight(6 + a[i]);
            cp[7 + a[i]] = new rook(7 + a[i]);
            for (int j = 8; j < 16; j++) {
                cp[j + a[i]] = new pawn(a[i] + j);
            }

        }
       for ( int i = 0 ; i < 8 ; i ++ )
           for ( int j = 0 ;j < 8 ; j ++ )
               if ( b[i][j] != -1 ) cp[b[i][j]].get_pose(i,j);

    }

// validates the move and updates the board b
    public void move ( int x ,int y , int i , int j )  {
       // check turns
        if ( (turn && b[x][y] < 16 ) || ( !turn && b[x][y] >= 16 )){ System.out.println("invalid move"); return ; }
        // no pieces in that place
        if ( b[x][y] == -1 ) { System.out.println("invalid move"); return ;}

        boolean is_valid=  cp[b[x][y]].validator(i,j,b[x][y], b[i][j]);
        // check the kings
        if (is_valid) {
            if (b[i][j] == 4) {
                System.out.println("White is the winner");
                en = true;
                return;
            } else if (b[i][j] == 20) {
                System.out.println("Black is the winner ");
                en = true;
                return;
            }
            // update the board
            b[i][j] = b[x][y];
            b[x][y] = -1;
            board_piece_type[i][j] =board_piece_type[x][y] ;
            board_piece_type[x][y] = '_';
            turn= !turn ;
        }
        else { System.out.println("invalid move"); }


    }


//printing the board state ;
    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(board_piece_type[i][j]+" ");
            System.out.println();
        }
    }
}

