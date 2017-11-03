package model;

public class n_knight extends chess_piece {

    n_knight(int x ){
        this.id = x ;
    }

    public boolean validator ( int i , int j  , int id1 , int id2 ) {
        int[][] qualified_moves = new int[][] {
                {-2,1} ,
                {-2,-1},
                {-1,-2},
                {-1,2},
                {1,-2},
                {1,2},
                {2,-1},
                {2,1}
        };
        for ( int k = 0 ;k <  8 ; k ++ ) {
                if ( i == this.x-qualified_moves[k][0] && j == this.y-qualified_moves[k][1]){ this.move(i ,j); return true ;}
        }
        return false ;
    }
    public void move ( int i , int j ) {
        this.x = i ;
        this.y = j ;
    }
}
