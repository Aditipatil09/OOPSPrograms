
public class Studentinfo {
    private String Name;
    private int age;
    private int id;

    public Studentinfo(String Name, int age, int id){
        this.Name= Name;
        this.age =age;
        this.id =id;
    }
    public void printStudentDetails(){
        System.out.println("Student Name:" +Name);
        System.out.println("Student age:" +age);
        System.out.println("Student id:" +id);
    }
    public static void main(String args[]){
        Studentinfo student1= new Studentinfo("john" , 20, 201);

        student1.printStudentDetails();
    }
}



