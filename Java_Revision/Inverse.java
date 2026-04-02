//INVERSE NUMBER

package Java_Revision;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        int inverse=0;
        int position=1;
        int n;
        System.out.println("enter nuumber");
        Scanner scn=new Scanner(System.in);
        n=scn.nextInt();
    while(n!=0){
        int digit=n%10;
        inverse=inverse+position*(int)Math.pow(10, digit-1);
        n=n/10;
        position++;
        
     }
     System.out.println("The inverted number is: " + inverse);
    }
}
