/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L5_Activity_One
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = scan.nextInt();


        for (int i = 0; i < str.length(); i++){
            for (int k = 0; k < num; k++){
                System.out.print(str.substring(i, i + 1));
            }
        }

    }
}