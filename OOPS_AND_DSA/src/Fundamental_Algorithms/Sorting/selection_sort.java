package Fundamental_Algorithms.Sorting;

public class selection_sort {
    public static void main(String[] args) {
        selection_sort(new int[]{23, 78 ,24 ,89,10,35});
    }


    public static void selection_sort(int [] arr){

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                
            }
            
        }
        System.out.println("Sorted array is: ");
        for (int i : arr) {
            System.out.print(" "+i);
            
        }
    
    }
    
    
}

