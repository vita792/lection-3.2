package com.company.lesson2;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] userNumbers = new int[3];
        System.out.println("Enter three numbers: ");
        Scanner numb = new Scanner(System.in);
        for (int i =0; i < userNumbers.length; i++) {
            userNumbers[i] = numb.nextInt();
        }
        if        (userNumbers[0]%2 != 0 && userNumbers[1]%2 != 0  && userNumbers[2]%2 != 0) {
            System.out.println("Your summ is: " + (userNumbers[0] + userNumbers[1] + userNumbers[2]));

        } else if (userNumbers[0]%2 == 0 && userNumbers[1]%2 != 0  && userNumbers[2]%2 != 0) {
            System.out.println("Your summ is: " + (userNumbers[1] + userNumbers[2]));

        } else if (userNumbers[0]%2 == 0 && userNumbers[1]%2 == 0 && userNumbers[2]%2 != 0) {
            System.out.println("Your summ is: " + (userNumbers[2]));

        } else if (userNumbers[0]%2 == 0 && userNumbers[1]%2 != 0 && userNumbers[2]%2 == 0) {
            System.out.println("Your summ is: " + (userNumbers[1]));

        } else if (userNumbers[0]%2 != 0 && userNumbers[1]%2 == 0 && userNumbers[2]%2 != 0) {
            System.out.println("Your summ is: " + (userNumbers[0] + userNumbers[2]));

        } else if (userNumbers[0]%2 != 0 && userNumbers[1]%2 == 0 && userNumbers[2]%2 == 0) {
            System.out.println("Your summ is: " + (userNumbers[0]));

        } else if (userNumbers[0]%2 != 0 && userNumbers[1]%2 != 0  && userNumbers[2]%2 == 0) {
            System.out.println("Your summ is: " + (userNumbers[0] + userNumbers[1]));

        } else {
            System.out.println("There are no odd numbers!" );
        }
    }
}
