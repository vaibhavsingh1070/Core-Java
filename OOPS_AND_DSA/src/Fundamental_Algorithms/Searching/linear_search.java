package Fundamental_Algorithms.Searching;

import java.util.Scanner;

public class linear_search {

    public static void main(String[] args) {
        int [] numbers = {1,76,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        for (int i : numbers) {
            System.out.print(" ,"+i);
        }
        System.out.println("Search any number from above : ");
        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if(x == numbers[i]){
                System.out.println("found at "+i+" index");
                break;
            }else{
                System.out.println("Number not found!");
            }
            
        }

    }
    
}
