import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        String original = word.nextLine();

        String lowOrig = "";
        for(int i = 0; i < original.length() ; i++)
        {
            char ch = Character.toLowerCase(original.charAt(i));
            lowOrig += ch;
        }

        boolean palindrome = true;
        for(int i = 0; i < lowOrig.length() / 2; i++)
        {
            char left = lowOrig.charAt(i);
            char right = lowOrig.charAt(lowOrig.length() - 1 - i);
            
            if(left != right)
            {
                palindrome = false;
                break;
            }
        }

        if(palindrome)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }

        word.close();
    }
}
