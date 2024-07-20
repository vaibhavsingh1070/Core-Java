package Fundamental_Algorithms.Basic_Problems;

public class fibonacci_series {
    public static void main(String[] args) {
        print_fibonacci_series(21);
    }

    public static void print_fibonacci_series(int range){
        //strating from 0 and 1 and followed by sum of last two digits

        if(range <= 0)
        {
            System.out.println("Invalid Input!");
        }
        int first = 0;
        int second = 1;
    
        System.out.print(first);
    
        if( range > 1)
        {
            System.out.print(" "+second);
        }
    
        for (int i = 3; i <= range; i++) {
            
                int next = first + second;
                System.out.print(" "+next);
                first = second;
                second = next; 
        }
    
    }
    
}


