package Fundamental_Algorithms.Basic_Problems;

public class prime_number {

    public static void main(String[] args) {
        prime(13);
    }
    
    public static void prime(int num){

        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0)
                {
                   isPrime = false;
                   break;
                }   
            }
            if(isPrime){
                System.out.print(" "+i);
            }
        }
    }
}



