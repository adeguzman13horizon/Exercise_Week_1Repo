package Wednesday1;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        System.out.println("Welcome to Sololearn");
        System.out.println("1 - View Lessons");
        System.out.println("2 - Take Challenge");
        System.out.println("3 - Chat");
        System.out.println("4 - View Discussions");
        System.out.println("5 - Online Challenge");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Here are the lessons");
                System.out.println("Python");
                System.out.println("Java");
                System.out.println("C++");
                break;
            case 2:
                System.out.println("Now chatting with a friend");
                break;
            case 3:
                System.out.println("Please wait for online match making");
                break;
            default:
                System.out.println("Invalid option!");

        }



        char c = 'a';
        switch (c) {
            case 'a': System.out.println("You clicked a letter");
        }

    }
}
