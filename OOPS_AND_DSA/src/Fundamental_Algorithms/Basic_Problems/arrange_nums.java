package Fundamental_Algorithms.Basic_Problems;

public class arrange_nums{
    /*public static void main(String[] args) {
        // arrange(new int[]{0,1,1,0,1,1,0,0,0,1,0,1}); not working
        // arrange_string("011011000101"); not working
        
        String number = "011011000101";
        //string builder for zeros and ones
        StringBuilder zeros = new StringBuilder();
        StringBuilder ones = new StringBuilder();

        //iterate through the given number string
        for (char c : number.toCharArray()) {
            if(c == '0')
            {
                zeros.append(c);
            }
            else{
                zeros.append(c);
            }
            
        }

        //now printing all zeros first
        System.out.println(zeros.toString()+" "+ones.toString());
    } */

    // giver number 011011000101
    //print zeroes first

    //ai solution
    public static void main(String[] args) {
        String number = "011011000101";

        // StringBuilder for zeros and ones
        StringBuilder zeros = new StringBuilder();
        StringBuilder ones = new StringBuilder();

        // Iterate through the given number string
        for (char c : number.toCharArray()) {
            if (c == '0') {
                zeros.append(c);
            } else {
                ones.append(c);
            }
        }

        // Print all zeros first, then ones
        System.out.println(zeros.toString() +""+ ones.toString());
        //System.out.print(zeros.toString()+ones.toString());
    }


    public static void arrange_string(String str)
    {

    }


    //This method is not working 
    public static void arrange(int [] num)
    {
        int temp = 0;
        for (int i = 0; i < num.length - 1 ; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if(num[i] > num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = num[i];
                }
                
            }
            
        }

        System.out.println("Numbers after arranging : ");
        for (int i : num) {
            System.out.print(" "+i);
        }
    
    }
}