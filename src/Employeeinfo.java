public class Employeeinfo {
    private String Name;
    private int id;
    private double salary;
    public Employeeinfo(String Name, int id, double salary){
        this.Name =Name;
        this.id= id;
        this.salary =salary;
    }
    public double calculateYearlySalary(){
        return salary*12;
    }
    public void printEmployeeDetails(){
        System.out.println("Employee Name:" +Name);
        System.out.println("Employee id:" +id);
        System.out.println("Employee salary:" +salary);
    }
    public static void main(String args[]){
        Employeeinfo employee= new Employeeinfo("John", 102, 2345);
        double yearlySalary= employee.calculateYearlySalary();
        System.out.println("Yearly Salary:" +yearlySalary);
        employee.printEmployeeDetails();
    }
}
