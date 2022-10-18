package week7_hw_komal;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF */

import java.util.Scanner;

public class Program5_GrossSalary {

    int empId;
    String name;
    double salary;
    double hra;
    double ta;
    double da;
    double pf;
    double total;

    public static void main(String[] args) {

        Program5_GrossSalary obj = new Program5_GrossSalary();
        obj.getEmpDetails();
        obj.printSalarySlip();

    }

    public void getEmpDetails(){

        Scanner s =new Scanner(System.in);
        System.out.println("Enter employee ID:");
        empId = s.nextInt();
        System.out.println("Enter Name of employee");
        name = s.next();
        System.out.println("Enter basic salary of employee:");
        salary = s.nextInt();
        s.close();

        hra = salary*0.1;
        da = salary*0.08;
        ta = salary*0.09;
        pf = salary*0.2;
        total = hra + ta+ da - pf;
    }

    public void printSalarySlip(){

        System.out.println("|______________________________|");
        System.out.println("|           Salary Slip         |");
        System.out.println("|                               |");
        System.out.println("|_______________________________|");
        System.out.println("|     Employee id: " + empId +"         |");
        System.out.println("|     Employee Name: " + name +"        |");
        System.out.println("|_______________________________|");
        System.out.println("|     Basic Salary: " + salary +"     |");
        System.out.println("|     HRA 10%:       " + hra +"     |");
        System.out.println("|     DA 8%:         " + da +"     |");
        System.out.println("|     TA 9%:         " + ta +"     |");
        System.out.println("|     PF -20%:       " + pf +"     |");
        System.out.println("|_______________________________|");
        System.out.println("|     Gross Salary:" + total +"       |");
        System.out.println("|===============================|");





    }

}
