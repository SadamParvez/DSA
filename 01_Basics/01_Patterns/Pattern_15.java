public class Pattern_15 {
    public static void main(String[] args) {

        int N =5;

        for(int i = N ; i > 0 ; i--){
            for(char ch = 'A' ; ch < 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }


    }
}



/*

ABCDE
ABCD
ABC
AB
A

*/