package Test_Using_Extending;
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        Human h1 = new Human();
        h1.setName("Dav");
        h1.setSurname("Gal");
        h1.setGender("male");
        h1.setAge(18);
        System.out.println("Information about " + h1.getName());
        h1.getInfo();
        System.out.println();
        Teacher t1 = new Teacher();
        t1.setName("David");
        t1.setSurname("Galstyan");
        t1.setAge(19);
        t1.setGender("male");
        t1.setSalary(100000);
        System.out.println("Information about " + t1.getName());
        t1.getInfo();
        System.out.println();
        Student s1 = new Student();
        s1.setName("Davidik");
        s1.setSurname("Galstyan");
        s1.setAge(18);
        s1.setGender("male");
        s1.setStudentSalary(5000);
        System.out.println("Information about " + s1.getName() );
        s1.getInfo();
        System.out.println();
        Human h2 = new Human();
        System.out.println("Set your human \n enter his name");
        h2.setName(s.nextLine());
        System.out.println("Set his surname");
        h2.setSurname(s.nextLine());
        System.out.println("Set his gender");
        h2.setGender(s.nextLine());
        System.out.println("Set his age");
        h2.setAge(s.nextInt());
        h2.getInfo();
    }
}
