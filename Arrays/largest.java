package Arrays;

public class largest {

    public static int findLargest(int numbers[]){
        int largestNo=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largestNo){
                largestNo= numbers[i];
            }
        }
        return largestNo;
    }
    public static void main(String[] args) {
        int numbers[]={21,11,43,54,61,22,31,41};
        System.out.println(findLargest(numbers));
    }
}
