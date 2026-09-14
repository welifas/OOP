import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        String original = word.nextLine();

        String loworig = "";
        for(int i = 0; i < original.length() ; i++) {
            char ch = original.charAt(i);
            if(ch >= 'А' && ch <= 'Я' || ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            loworig += ch;
        }

        boolean palindrome = true;
        for(int i = 0; i < loworig.length() / 2; i++) {
            char left = loworig.charAt(i);
            char right = loworig.charAt(loworig.length() - 1 - i);
            
            if(left != right) {
                palindrome = false;
                break;
            }
        }

        if(palindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

        word.close();
    }
}
