
/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U4_L3_Activity_Four
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num > 0){
            for (;num >= 0; num--){
                if (num % 3 == 0){
                    System.out.print(num + " ");
                }
            }
        }else{
            System.out.println("error");
        }

    }
}