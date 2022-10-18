package week7_hw_komal;

//Write a Java program to sum values of an array.

public class Program18_sumOfArray {

    public static void main(String[] args) {

        Program18_sumOfArray obj = new Program18_sumOfArray();
        obj.sumOfArray();
    }

    public void sumOfArray(){
        int a[] = {1,2,3,4,5};
        int sum = 0;
        System.out.println("Original array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Sum of array is: ");
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);

    }


}
