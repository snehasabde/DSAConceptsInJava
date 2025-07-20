import java.util.*;

public class Searching {
    public static int linearSearch(int nums[] ,int target) {
        int step = 0;
             for(int i = 0 ;i <nums.length ; i++ ) { 
                   step++;
                 if(nums[i] == target) {
                    System.out.println("Steps reuired are:" + step);
                    return i;
                }    
            }
            System.out.println("Steps reuired are:" + step);
            return -1;
    }

    public static int binarySearch(int nums[] , int target) {
        int step = 0;
        int l = 0;
         int r = nums.length-1;
         int mid;

        while (l<=r) {
            step++;
            mid = (l+r)/2;
                if(mid == target) {
                    //To count the no. of steps we use below syso line 
                 System.out.println("Steps reuired are:" + step);
                    return mid;
                } else if (mid < target) {
                    l = mid+1;
                } else {
                    r = mid-1;
                }
        }
          //To count the no. of steps 
           System.out.println("Steps required are:" + step);
        return -1;
    }


    public static void main(String [] args) {

     int nums[] =  {5,7,9,11,13,17,19,23};
     int target = 19;
     int ch;
          Scanner sc = new Scanner(System.in);
          ch = sc.nextInt();

        switch(ch) {

        case 1 :         //for the linear searching  
        System.out.println("You are trying to search for the linear Search");
            int result1  = linearSearch(nums , target);

              if(result1 != -1) {
                 System.out.println("Element found at index : " + result1);
               }
            break;

        case 2 :         //for the binary searching  
         System.out.println("You are trying to search for the binary Search"); 
            int result2  = linearSearch(nums , target);

              if(result2 != -1) {
                 System.out.println("Element found at index : " + result2);
             }
            break;

         default : 
             System.out.println("Wrong choice press... Try again...");
             return;    
        }

    }
    
}
