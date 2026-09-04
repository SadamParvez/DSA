public class Pattern_14 {

    public static void main(String[] args) {
        int N = 5;
        for(int i = 0 ; i < N ; i++){

            for(char ch = 'A'  ; ch <= 'A' + i ; ch++){
                System.out.print(ch);
            }
            
            System.out.println();
        }
    }
    
}




/*

N = 5

A
AB
ABC
ABCD
ABCDE

*/