/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <=0 || num >=50){
            System.out.println("error");
        }else {
//            for (int i = 0; i <= (50 - num); i++) {
//                if (((50 - num) + i -1)% 5 == 0) {
//                    System.out.println(((50 - num) + i) -4 + " ");
//                } else System.out.print(((50 - num) + i)-4 + " ");
//            }
            int spot = 0;
            for (;num <= 50; num++){
                if (spot == 5){
                    spot = 0;
                    System.out.print("\n");
                }
                spot++;
                System.out.print(num + " ");
            }

        }

    }
}