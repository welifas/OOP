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

        String reverse = "";
        for(int i = loworig.length() - 1; i >=0; i--) { 
            char ch = loworig.charAt(i);
            reverse += ch;
        }

        boolean palindrome = true;
        for(int i = 0; i < loworig.length() ; i++) {
            if(loworig.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        if(palindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}