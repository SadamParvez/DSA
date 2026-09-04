public class Pattern_16 {
    public static void main(String[] args) {
        int N = 5;
        char c = 'A';
        for(int i = 0 ; i < N; i++){
            for(char ch = 'A' ; ch <= 'A' + i ; ch++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }   
}




/*

N = 5

A
BB
CCC
DDDD
EEEEE

*/