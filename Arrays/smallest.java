package Arrays;

public class smallest {
     public static int findSmallest(int numbers[]){
         int smallest=Integer.MAX_VALUE;
         for(int i=0;i<numbers.length-1;i++){
               if(numbers[i]<smallest){
                smallest=numbers[i];
               }
         }
         return smallest;
     }

    public static void main(String[] args) {
        int numbers[]={31,23,98,47,11,88,24};
        System.out.println("Smallest no. in this array is : " + findSmallest(numbers));
    }
}
