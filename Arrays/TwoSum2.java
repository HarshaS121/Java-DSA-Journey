package Arrays;

import java.util.Arrays;

public class TwoSum2 {
    public static int[] TwoSum(int num[] ,int target){
        int right=num.length-1;
        int left=0;
       

        while(right>left){
             int n=num[right]+num[left];
            if(n == target){
                return new int[] {left,right};
               }
               if(n>target){
                right--;
               }
               if(n<target){
                left++;
               };
        };
         return new int[]{-1,-1};
    };
    public static void main(String args[]){
        int num[]={12,22,25,31,45,51};
        int target=53;
        int[] result=TwoSum(num,target);
        System.out.println("Index start from 0");
        System.out.println("Indexs" + Arrays.toString(result) + "is the correct sum.");
    }
}
