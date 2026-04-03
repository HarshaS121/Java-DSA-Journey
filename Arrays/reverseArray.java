package Arrays;

public class reverseArray {
    public static void reverse(int numbers[]){
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        int numbers[]={21,32,43,22,11,65};
         reverse(numbers);
         System.out.println("Reverse Array is :");
        for(int i=0;i<numbers.length;i++){
            System.out.print( numbers[i] + " ");
        }
        System.out.println();
    }
}
