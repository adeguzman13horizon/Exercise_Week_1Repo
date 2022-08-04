package Wednesday1;

import java.util.Scanner;

public class LoopsExample {
    public static void main(String[] args) {
        System.out.println("For Loop");
        // if we have a numeric loop, it's easier to write it as a for loop

        /*for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        //special loop statements
        for (int i = 0; i < 10; i++) {
            //loop body
            if (i % 2 == 0) {
                System.out.println("Even!");
                //continue means skip the rest of this iteration
                continue;
            }
            System.out.println(i);
        }

        //break
        for (int i = 0; i < 20; i++) {
            if (i == 13) {
                break;
            }
            System.out.println(i);
        }*/


        for (int i = 0; i < 10; i++) {
            //we have to use a different counter for the inner loop
            for (int j = 0; j < 10; j++) {
                System.out.println("i " + i + " j " + j);
                //  if(j == 9) {
                //    break;
                // }



                /*int thresh = 50;
                Scanner sc = new Scanner(System.in);

                while (true) {
                    System.out.println("Enter height => ");
                    int ht = sc.nextInt();
                    //if we do not meet height, then we continue or skip this person
                    if(ht < thresh) {
                        //continue will move on to the next person and skip the rest of the step and move on the rest of the loop
                        continue;
                    }
                    //otherwise, move on to this person
                    System.out.println("Enjoy the ride");
                } */




            }
        }
    }
}
