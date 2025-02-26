package Array.Question;

import java.util.Scanner;

public class Pri {
    public static void main(String[] args) {
        int x  , i ;
         
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the intial value : ");
        int L = SC.nextInt();
        System.out.print("Enter the final value : ");
        int Y = SC.nextInt();
        for ( x = 1 ; x < 100 ; x++){
            for ( i = 2 ; i < x ; i++ ){
                if( x % i == 0) break;
            }
            if ( i == x ) System.out.print(i+"  ");
        }
    }
}
