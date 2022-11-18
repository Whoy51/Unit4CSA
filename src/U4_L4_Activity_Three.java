/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        String newstr = "";

        if (str1.length() != str2.length()){
            System.out.println("error");
        }else {
            for (int i = str2.length() - 1; i >= 0; i--){
                newstr += str2.substring(i, i + 1) + str1.substring(i, i + 1);
            }
            System.out.println(newstr);
        }


    }
}