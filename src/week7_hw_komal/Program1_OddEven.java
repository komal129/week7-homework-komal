package week7_hw_komal;

//Write a java program that tells us that Input number is odd or even?

import java.util.Scanner;

public class Program1_OddEven {

    public static void main(String[] args) {

        Program1_OddEven obj= new Program1_OddEven();
        int num = obj.getInput();
        obj.findOddEven(num);
    }

    public int getInput(){
        // Get input from user

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = s.nextInt();
        s.close();
        return num;
    }

    public void findOddEven(int num){
        // Find if a number is odd of even

        String msg = (num%2==0)?"Number is even":"Number is odd";
        System.out.println(msg);
    }
}
