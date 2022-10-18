package week7_hw_komal;

//Write a Java program to calculate the average value of array elements.

public class Program19_AvgOfArray {

    public static void main(String[] args) {
            Program19_AvgOfArray obj = new Program19_AvgOfArray();
            obj.avgofArray();
    }

    //Calculate average value of array elements
    public void avgofArray(){

        int a[] = {1,2,3,4,5};
        float avg = 0;
        int sum = 0;
        System.out.println("Original array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        avg = sum/a.length;

        System.out.println("Average of given array is: " + avg);

    }
}
