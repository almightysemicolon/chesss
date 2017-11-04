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
