package Fundamental_Algorithms.Sorting;

public class bubblr_sort {
    public static void main(String[] args) {
        bubble_sort(new int[] {25,63,10, 5, 90});
    }

    
    public static void bubble_sort(int [] arr){

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 ; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
            
        }
        System.out.println("Sorted array is: ");
        for (int i : arr) {
            System.out.print(" "+i);
            
        }
    
    }
    
}
