package week7_hw_komal;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry

import java.util.Scanner;

public class Program8_CityName {

    public static void main(String[] args) {

       Program8_CityName obj = new Program8_CityName();
       char city = obj.getInput();
       obj.displayCityName(city);

    }

    public char getInput(){

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter any alphabet from A to F: ");
        char a = s.next().charAt(0);
        s.close();
        return a;

    }

    public void displayCityName(char a){

        if (a == 'A') {

            System.out.println("Ahmedabad");

        } else if (a == 'B') {

            System.out.println("Bangalaore");

        } else if (a == 'C') {

            System.out.println("Chandigadh");

        } else if (a == 'D') {

            System.out.println("Delhi");

        } else if (a == 'E') {

            System.out.println("Etah");

        } else if (a == 'F') {

            System.out.println("Faridabad");

        } else {

            System.out.println("Invalid Entry");
        }


    }
}
