//count digit and vertically write the no.

package Java_Revision;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
       
      
       Scanner scn=new Scanner(System.in);
       System.out.println("enter number");
       int n=scn.nextInt();
       
       int temp=n;
       int count=0;

       
       while(temp>0){
        temp=temp/10;
        count++;
       }

    //    System.out.println(count);


       int div=(int)Math.pow(10,count-1);
       while(div>0){
        int quotient=n/div;
        System.out.println(quotient);

        n=n%div;
        div=div/10;
       }
      
    }
}
