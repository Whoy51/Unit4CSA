/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L4_Activity_Two
{
    public static void main(String[] args)
    {

        String COMMON = "etaio";
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String newstr = "";
        for (int i = 0; i < str.length(); i++){
            if (!COMMON.contains(str.substring(i, i + 1).toLowerCase())){
                newstr += str.substring(i, i + 1).toLowerCase();
            }
        }
        System.out.println(newstr);

    }
}