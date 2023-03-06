package Test_Using_Extending;

public class Student extends Human {
    private int studentSalary;
    public void setStudentSalary(int studentSalary){
        this.studentSalary = studentSalary;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Student salary:" + studentSalary);
    }
}
