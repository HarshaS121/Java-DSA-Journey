package Arrays;

public class reverseInteger {
    public static int reverse(int n){
        int reversed_no=0;
        while(n!=0){
            int last_digit=n%10;

            if(reversed_no>Integer.MAX_VALUE/10 || reversed_no == Integer.MAX_VALUE && last_digit>7){
                return 0;
            }
             if(reversed_no<Integer.MIN_VALUE/10 || reversed_no == Integer.MIN_VALUE && last_digit<-8){
                return 0;
            }else{
               reversed_no=(reversed_no*10)+last_digit;
               n=n/10;
            }
        };
        return reversed_no;
    }
    public static void main(String[] args) {
        int myNum=123478678;
        int result=reverse(myNum);
        System.out.println("Reversed no. is " + result);
    }
}
