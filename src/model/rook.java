package model;

public class rook extends chess_piece{

    rook(int x ){
        this.id = x ;
    }


    public boolean validator ( int i , int j  , int id1 , int id2 ) {
        if ( this.x == i ||this.y == j ){ this.move(i , j) ;  return true ; }
        return false;
    }
    public void move ( int i , int j ) {
        this.x = i ;
        this.y = j ;
    }
}
