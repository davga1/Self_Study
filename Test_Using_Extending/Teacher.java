package Test_Using_Extending;

public class Teacher extends Human{
    private int salary;
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Salary:" + salary);
    }
}
