

public class PrmeNum {
    public static void main(String[] args) {
        int x  , i ;

        for ( x = 1 ; x < 100 ; x++){
            for ( i = 2 ; i < x ; i++ ){
                if( x % i == 0) break;
            }
            if ( i == x ) System.out.print(i+"  ");
        }
    }
}
