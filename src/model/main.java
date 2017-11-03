package model;
import java.util.Scanner;
public class main {
   static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args){
        //new game

        String s = sc.next();
        while ( s.equals("N")) {

            board b = new board();
            while ( b.en == false ) {
                b.print();
                int x = sc.nextInt(), y = sc.nextInt(), i = sc.nextInt(), j = sc.nextInt();

                b.move(x, y, i, j);
            }
            s = sc.next();

        }


    }

}
/* version 1.1 --------------------------------------------------------------------------
  public static void main(String[] args){
        //new game
        Scanner usr_inp = new Scanner(System.in) ;
       board B=new board();
       int turn = 0 ;
        while (B.stat == 0) {
            // outputs format of the game
            for ( int i = 0 ;i < 8 ;i ++ ) {
                for ( int j =0 ;j< 8 ;j ++ ) {
                    System.out.print(B.board_piece_type[i][j] + " ");
                }
                System.out.println();
            }
            int x1, y1, x2,y2;
            x1=usr_inp.nextInt();
            y1=usr_inp.nextInt();
            x2=usr_inp.nextInt();
            y2=usr_inp.nextInt();
            if (x1== -1 ) return ;
            int status_f = B.status (x2 ,y2 ) , status_i =  B.status( x1 , y1) ;
            char type_f= B.piece_type(x2,y2) , type_i=B.piece_type(x1,y1) ;// final and initial
            if ( turn != status_i -1 ) {
                System.out.println("invalid move");
                continue;
            }
            if ( status_f == status_i )

                System.out.println("occupied");
            else {
                // switch cases
                // make the move
                // use a boolean to mark the validation
                 boolean valid = false;
                switch ( type_i) {
                    case 'r':// rook
                        valid= rook.validator(x1,y1,x2,y2); break;
                    case 'n': // knight
                        valid= n_knight.validator(x1,y1,x2,y2); break;
                    case 'b': // bishop
                        valid= bishop.validator(x1,y1,x2,y2); break;
                    case 'q': //queen
                        valid= queen.validator(x1,y1,x2,y2); break ;
                    case 'k': //king
                        valid= king.validator(x1,y1,x2,y2); break;
                    case 'p': //pawn
                        valid= pawn.validator(x1,y1,x2,y2,status_i,status_f);break;
                    default: break;
                }
                if ( valid  )
                    B.move(x1,y1,x2,y2) ;
                else
                    System.out.println ( "invalid move") ;


            }
            turn = (turn+1)%2 ;
        }

        if ( B.stat== 1){
            System.out.println("black won");

        }
        else
            System.out.println("white won");
    }

 */