package Java;

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        int num = sc.nextInt();

        int rev = 0;

        while (num != 0) {

            rev = rev * 10 + num % 10;

            num = num / 10;

        }


    }
}
