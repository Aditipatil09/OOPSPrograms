import java.util.Scanner;

class Dog{
    String breed;
    int age;
    double weight;

    public Dog(String breed , int age , double weight ){
        this.breed = breed;
        this.age =age;
        this.weight=weight;
    }

    public int calculateHumanAge(){
        if(age<=2){
            return age*11;
        }else{
            return 22+(age-2)*5;
        }
    }
    public void printDogInfo(){
        System.out.println("Breed:" +breed);
        System.out.println("Age: "+age+ "Years(in human years :" +calculateHumanAge()+ "years");
        System.out.println("Weight:" +weight+ "kg");
    }
}
public class DogTest {
    public static void main(String args[]){
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter the breed of the dog:");
        String breed= scanner.nextLine();
        System.out.println("Enter the age of the Dog:");
        int age = scanner.nextInt();
        System.out.println("Enter the weight of the Dog:");
        double weight  =scanner.nextDouble();

        Dog myDog = new Dog(breed, age , weight);

        System.out.println("Dog information");
        myDog.printDogInfo();
        scanner.close();
    }
}
