package Fundamental_Algorithms.Searching;

public class binary_search {

    public static void main(String[] args) {

        //array must be sorted to perform binary search
        perform_search(new int[] {1, 3, 7, 9, 15}, 7);
    }
   
    public static void perform_search(int [] arr, int x)
    {
       int  start =  0;
       int end = arr.length;
        while(start < end){
            int mid = (start + end)/2;
            if(x > arr[mid]){
                start = mid + 1;
            }
            else if(arr[mid] == x)
            {
                System.out.println(x+" found at "+mid);
                break;
            }else{
                end = mid - 1;
            }

            if(start > end)
            {
                System.out.println(x+ " not found in the list");
            }
        }
    } 
}


