/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L4_Activity_One
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String VOWELS = "aeiou";
        String str = scan.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.toLowerCase().charAt(i) == 'p' && (VOWELS.toLowerCase().contains(str.substring(i + 1, i + 2).toLowerCase()))) {
                count++;
            }
        }
        System.out.println("Contains p followed by a vowel " + count + " times.");
    }
}
