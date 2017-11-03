package model;

public class queen extends chess_piece {

    queen(int x ){
        this.id = x ;
    }


    public boolean validator ( int i , int j  , int id1 , int id2 ) {
        if ( this.x == i || this.y == j ) return true;
        if ( ( this.x + this.y ) == ( i+ j ) || ( this.x - this.y ) == ( i - j )) { this.move(i ,j) ;  return true ;}
        return false;
    }
    public void move ( int i , int j ) {
        this.x = i ;
        this.y = j ;
    }
}
