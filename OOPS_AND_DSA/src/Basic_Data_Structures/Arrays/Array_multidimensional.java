package Basic_Data_Structures.Arrays;

import java.util.Scanner;
public class Array_multidimensional {

    public static void main(String[] args) {
        int [][] arr = new int[2][2];
        int [][] arr1 = new int[2][2];
        int [][] sum = new int[2][2];
        Scanner sc = new Scanner(System.in);

        //Input in array one 
        System.out.println("Enter elements in 2 x 2 in first array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] =  sc.nextInt();
            }
        }

        //Input in array two
        System.out.println("Enter elements in 2 x 2 second array: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] =  sc.nextInt();
            }
        }

        //calculate sum 
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];     
            }
            
        }

        System.out.println("Sum of the array1 and array2: ");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
