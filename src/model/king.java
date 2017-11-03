package model;

public class king extends chess_piece{

    king(int x ){
        this.id = x ;
    }


    public boolean validator ( int i , int j  , int id1 , int id2 ) {
        this.x = this.x - i ;
        this.y = this.y -j ;
      this.x = this.x * this.x ;
       this.y = this.y*this.y ;
       // fix with absolute value --------------
       if ( this.x > 1 || this.y > 1 ) return false;
       this.move ( i ,j );
       return true ;
    }
    public void move ( int i , int j ) {
        this.x = i ;
        this.y = j ;
    }
}
