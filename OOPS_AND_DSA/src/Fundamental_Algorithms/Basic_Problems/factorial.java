package Fundamental_Algorithms.Basic_Problems;

public class factorial {
    public static void main(String[] args) {
        factorial(5);
    }



    public static int factorial(int num)
    {
        if(num == 0){
            return 1;
        }else{
           int result= factorial(num - 1 ) * num;
           System.out.println("The result is "+result);
           return result;
        }
        
    }
    
}


