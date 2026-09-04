public class Pattern_12 {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            
            for(int j = 1 ; j <= i ; j ++){
                System.out.print(j);
            }

            // for(int k = n -i ; k > 0 ; k--){
            //     System.out.print(" ");
            // }

            // for(int l = n -i ; l > 0 ; l--){
            //     System.out.print(" ");
            // }

            // to get the formulla 2*n - (2*i)  - calculate the number of spaces 8 , 6 , 4 , 2 , 0 -- 2*n-(2*i)

            for (int j = 1; j <= 2*n-(2*i); j++) {
                System.out.print(" ");
            }

            for(int m = i;  m > 0 ; m--){
                System.out.print(m);   
            }
            System.out.println();

        }
    }

    
}





/*

1        1
12      21
123    321
1234  4321
1234554321

*/