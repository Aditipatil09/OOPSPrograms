import java.util.Scanner;

class Phone {
    String make;
    String model;
    int storage;

    public Phone(String make, String model, int storage) {
         this.make=make;
         this.model =model;
         this.storage =storage;
    }

    public double calculatePrice() {
        double basePrice = 500;
        double storagePrice = storage * 0.1;
        return basePrice + storagePrice;
    }

    public void printPhoneInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model:" + model);
        System.out.println("Storage:" + storage + "GB");
        System.out.println("price:" + calculatePrice());
    }
}
public class PhoneTest {
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Make of the phone :" );
        String make= scanner.nextLine();
        System.out.println("Enter the Model of the phone:");
        String model = scanner.nextLine();
        System.out.println("Enter the Storage of the Phone:");
        int storage = scanner.nextInt();

        Phone myPhone = new Phone(make , model ,storage);

        System.out.println("Phone Information:");
        myPhone.printPhoneInfo();
        scanner.close();
    }
}
