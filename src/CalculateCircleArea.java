import java.util.Scanner;

class Circle
{
    double radius ;
    public Circle(double radius){
        this.radius =radius;
    }
    public double calculateArea(){
        return Math.PI * Math.pow(radius ,2);
    }
    public double calculateCircumstances(){
        return 2 * Math.PI *radius;
    }
}
public class CalculateCircleArea {
    public static void main(String args[]){
        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        Circle myCircle= new Circle (radius);

        System.out.println("Enter the radius of the circle :" +myCircle.calculateArea());

        System.out.println("Enter the Circumstances of circle:" +myCircle.calculateCircumstances());
    }

}
