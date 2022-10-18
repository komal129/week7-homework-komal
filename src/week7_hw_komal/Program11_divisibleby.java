package week7_hw_komal;

//Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.

public class Program11_divisibleby {
    int a[] = new int[100]; //array declaration and initialization

    public Program11_divisibleby() {

        //Storing values in array
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        Program11_divisibleby obj = new Program11_divisibleby();
        obj.findDivisibleBy3();
        System.out.println("");
        obj.findDivisibleBy5();
    }

    public void findDivisibleBy3() {

        System.out.println("Numbers divisble by 3 are: ");
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 3 == 0)) {

                System.out.print(a[i] + " ");
            }
        }

    }

    public void findDivisibleBy5() {

        System.out.println("Numbers divisble by 5 are: ");
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 5 == 0)) {

                System.out.print(a[i] + " ");
            }
        }

    }
}
