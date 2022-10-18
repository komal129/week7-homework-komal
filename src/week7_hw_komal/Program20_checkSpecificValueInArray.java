package week7_hw_komal;

//20. Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class Program20_checkSpecificValueInArray {

    public static void main(String[] args) {

        Program20_checkSpecificValueInArray obj = new Program20_checkSpecificValueInArray();
        obj.checkArray();

    }

    public void checkArray() {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean found = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 10");
        int num = s.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {

                System.out.println("Array contains given number");
                found = true;
            }

        }
        if (!found) {
            System.out.println("Array does not contain given number");
        }
    }
}
