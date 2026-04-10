package Arrays;

public class subArrays {

    public static void findSubArray(int numbers[]){
        
        int total_subarrays=0;

        for(int i=0;i<numbers.length;i++){
                    
            for(int j=i;j<numbers.length;j++){
                    
                    System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k] + " ");
                    
                }
                total_subarrays++;
                System.out.println("]");
            }    
            System.out.println();
        }
        System.out.println("total subArrays : " + total_subarrays);
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8,9,10,11,12,13};
        findSubArray(numbers);
       
    }
}
