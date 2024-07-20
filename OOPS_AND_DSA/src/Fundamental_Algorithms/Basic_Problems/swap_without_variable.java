package Fundamental_Algorithms.Basic_Problems;

public class swap_without_variable {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a = "+a+"b = "+b);
        a = a + b;// a = 10 + 5 = 15
        b = a - b;// b = 15 - 5 = 10
        a = a - b;// a = 15 - 10 = 5

        System.out.println("\n a = "+a+" b = "+b);
       
    }
    
}
