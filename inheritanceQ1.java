import java.util.*;

class Student{
    private String firstName;
    private String lastName;
    private String hobby;
    private int age;

    public Student(){
        firstName = "";
        lastName = "";
        hobby = "";
        age = 0;
    }

    public Student(String firstN, String lastN, String hobb, int years){
        firstName = firstN;
        lastName = lastN;
        hobby = hobb;
        age = years;
    }
    /* set and get methods */
    public void setFirstName(String firstN){
        firstName = firstN;
    }

    public String getFirstName(){

        return firstName;
    }

    public void setLastName(String lastN){
        lastName = lastN;
    }

    public String getLastName(){
        return lastName;
    }

    public void setHobby(String hobb){
        hobby = hobb;
    }

    public String getHobby(){
        return hobby;
    }

    public void setAge(int year){
        age = year;
    }

    /* public void setAge(String firstN, String lastN, String hobb, int year){
        age = year;
    } */
    // why don't you have to do something like this instead?

    public int getAge(){
        return age;
    }

    /*end to set and get methods*/

    public int grade(){
        int grade = age - 4;
        return grade;
    }

    public String toString(){
        return "First name is: " + firstName + " last name is: " + lastName + " hobby is: " + hobby + " age is: " + age + " and grade is: " + grade();
    }



}

class Faculty extends Student{
    String specialty;

    public Faculty(){
        specialty = "";
    }

    public Faculty(String sp){
        specialty = sp;
    }

    public void setSpecialty(String sp){
        specialty = sp;
    }

    public String getSpecialty(){
        return specialty;
    }

    public String getFaculty(){
        return super.toString() + " and speciality is: " + getSpecialty();
    }

}


public class inheritanceQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Enter your hobby: ");
        String hobby = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        Student std = new Student(firstName, lastName, hobby, age);

        System.out.println("What is your specialty: ");
        String specialty = input.next();

        Faculty f = new Faculty(specialty);



    }
}
