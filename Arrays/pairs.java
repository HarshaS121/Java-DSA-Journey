package Arrays;

public class pairs {

    public static void findArrays(int numbers[]){
           int total_pairs=0;
        for(int i=0;i<numbers.length;i++){
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + current + "," + numbers[j] +")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are : " + total_pairs);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        findArrays(numbers);
    }
}
