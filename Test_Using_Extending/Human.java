package Test_Using_Extending;

public class Human {
   private String name;
   private String surname;
   private String gender;
   private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println("name:" + name + "\nsurname:" + surname + "\ngender:" + gender +"\nage:" + age);
    }
}
