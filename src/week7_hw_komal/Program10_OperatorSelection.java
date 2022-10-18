package week7_hw_komal;

//10.Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition, Subtraction, multiplication and division according to their symbol

import java.util.Scanner;

public class Program10_OperatorSelection {
    int num1;
    int num2;
    char op;

    public static void main(String[] args) {
        Program10_OperatorSelection obj = new Program10_OperatorSelection();
        obj.operation();
    }

    public Program10_OperatorSelection() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        num1 = s.nextInt();
        System.out.println("Please enter second number: ");
        num2 = s.nextInt();
        System.out.println("Please select any operator from(+, -, /, *): ");
        op = s.next().charAt(0);
        s.close();
    }

    public void operation() {
        //
        if (op == '+') {
            System.out.println("The result of " + num1 + op + num2 + ": " + (num1 + num2));
        }
        else if (op == '-') {
            System.out.println("The result of " + num1 + op + num2 + ": " + (num1 - num2));
        }
        else if (op == '/') {
            System.out.println("The result of " + num1 + op + num2 + ": " + (num1 / num2));
        }
        else if (op == '*') {
            System.out.println("The result of " + num1 + op + num2 + ": " + (num1 * num2));
        }
        else {
            System.out.println("Invalid operator");
        }
    }


}
