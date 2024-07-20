package Fundamental_Algorithms.Basic_Problems;

public class palindrom_check {

    public static void main(String[] args) {
        String input = "level";

        if(ispalidrom(input)){
            System.out.println(input +" is a palindrom");
        }else{
            System.out.println(input+"is not a palindrom");
        }
    }
    


    public static boolean ispalidrom(String word)
    {
        int left = 0;
        int right = word.length()-1;

        while(left < right)
        {
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


