import java.util.Scanner;

public class Rim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String[] thousand = {"", "M", "MM"};
        String[] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] decimal = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        System.out.print(thousand[number / 1000]);
        System.out.print(hundred[(number % 1000) / 100]);
        System.out.print(decimal[(number % 100) / 10]);
        System.out.print(unit[number % 10]);

        sc.close();
    }
}