package model;

public class pawn extends chess_piece {

    pawn(int x ){
        this.id = x ;
    }


    public boolean validator ( int i , int j  , int id1 , int id2 ) {

        // this can be implemented better --------------
        // if the pawn is black
        System.out.println ( this.x + " " + this.y + " " +  i  + " " + j + " "  + id1 + " " + id2 ) ;
        if ( id1 < 16 ) {
            if ( i == this.x + 1 && j == this.y  ) { this.move ( i , j ) ; return true ;}
            if ( id2 >= 16 && ( i == this.x + 1 ) && (( j == this.y +1 || j == this.y -1 ))) { this.move ( i , j ) ;  return true ; }
            System.out.println("INV"); ;
            return false ;
        }
        // if the pawn is white
        if ( i == this.x -1 && j== this.y ) return true ;
        if ( id2 < 16 && id2 >= 0  && ( i == this.x-1  ) && (( j == this.y +1 || j == this.y -1 ))) return true ;
        return false ;
    }
    public void move ( int i , int j ) {
        this.x = i ;
        this.y = j ;
    }
}
