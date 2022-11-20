import java.util.Scanner;

class Assignment4
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type the message to be shortened");
        String str = scan.nextLine().toLowerCase();

        // Algorithm 1

        String VOWELS = "aeiou";
        int vowels = 0;
        int repeats = 0;
        String algo1 = "";
        for (int i = 0; i < str.length(); i++){
            if (VOWELS.contains(str.substring(i , i + 1)) && i != 0 && !(str.charAt(i - 1) == ' ')) {
                vowels++;
                continue;
            }
            if (!VOWELS.contains(str.substring(i, i + 1)) && i!= 0 && !str.substring(i, i + 1).equals(" ") && str.substring(i - 1, i).equals(str.substring(i, i + 1))){
                repeats++;
                continue;
            }
            algo1 += str.substring(i, i + 1);
        }

        System.out.println("\nAlgorithm 1");
        System.out.println("Vowels removed:" + vowels);
        System.out.println("Repeats removed: " + repeats);
        System.out.println("Algorithm 1 message: " + algo1);
        System.out.println("Algorithm 1 characters saved: " + (str.length() - algo1.length()) + "\n");


        // Algorithm 2
        String algo2 = "";
        for (int i = 0; i < str.length(); i++){
            int count = 0;
            if (!algo2.contains(str.substring(i, i + 1)) && !str.substring(i, i + 1).equals(" ")){
                for (int k = 0; k<str.length(); k++){
                    if (str.substring(i, i + 1).equals(str.substring(k, k + 1))){
                        count++;
                    }

                }
                algo2 += count + str.substring(i, i + 1);
            }


        }
        System.out.println("Algorithm 2");
        System.out.println("Unique characters found: " + algo2.length() / 2);
        System.out.println("Algorithm 2 message: " + algo2);
        System.out.println("Algorithm 2 characters saved: " + (str.length() - algo2.length()));
    }

}
