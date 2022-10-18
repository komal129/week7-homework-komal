package week7_hw_komal;

//12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Program12_indentifyInput {

    public static void main(String[] args) {
        Program12_indentifyInput obj = new Program12_indentifyInput();
        char a = obj.getInput();
        obj.identifyInput(a);

    }

    public char getInput(){

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter any alphabet, number or special character: ");
        char ch = s.next().charAt(0);
        s.close();
        return ch;

    }

    public void identifyInput(char ch){

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A Alphabet.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is a Digit");

        } else {

            System.out.println(ch + " is a Character");
        }

    }
}
