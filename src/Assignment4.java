import java.util.Scanner;

class Assignment4
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

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

        System.out.println(vowels);
        System.out.println(repeats);
        System.out.println(algo1);
    }


}
