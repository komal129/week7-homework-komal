package week7_hw_komal;

//Write a class with the name Person. The class needs three fields (instance variables) with the names
//firstName, lastName of type String and age of type int.

public class Program14_Person {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }
}

 class Person{

    String firstName;
    String lastName;
    int age;

    public String getFirstName(){

        return this.firstName;
    }

    public String getLastName(){

        return this.lastName;
    }

    public int getAge(){

        return this.age;
    }

    public void setFirstName(String firstName){

        this.firstName = firstName;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;

    }

    public void setAge(int age){

        if(age<0 || age>100){

            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen(){

        boolean teen = false;
        if(this.age>12 && this.age<20){

           teen = true;

        }
        return teen;

    }

    public String getFullName(){
        String fullname = "";

        if (! this.firstName.isEmpty()){
            fullname = this.firstName;
        }

        if (! this.lastName.isEmpty()){
            fullname = fullname + this.lastName;
        }

            return fullname;
    }

}
