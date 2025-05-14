
package finding_gcd;

import java.util.Scanner;


public class Finding_GCD {


    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

        System.out.println("Please write the first positive number: ");
        int answer1 = input.nextInt();
        System.out.println("Please write the second positive number: ");
        int answer2 = input.nextInt();
        int gcd = 0;
        for (int i = 1; i<= 1000; i++)
        {
            if (answer1% i == 0 && answer2% i == 0){
                gcd = i;        
            }
        }
        System.out.println("The GCD between " + answer1 + " and " + answer2 + " is: " + gcd);
    }
    
}
