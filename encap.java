class employee
{
    private int empId;
    private float salary;
    private String name;
    private int age;

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}
public class encap {
    public static void main(String[] args) {
        employee e = new employee();
        e.setEmpId(1);
        e.setName("Deo");
        e.setSalary(2345f);
        e.setAge(20);
        System.out.println("EMployee Id :"+e.getEmpId());
        System.out.println("EMployee Name :"+e.getName());
        System.out.println("EMployee Salaary :"+e.getSalary());
        System.out.println("EMployee Age :"+e.getAge());

        
    }
    

   

}
