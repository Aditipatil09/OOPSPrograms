import java.util.Scanner;

class Computer{
    String Proccesor;
    int Ram;
    int Storage;

    public Computer(String Processor , int Ram, int Storage){
        this.Proccesor = Processor;
        this.Ram=Ram;
        this.Storage=Storage;
    }

    public double calculatePrice(){
        double basePrice =500;
        double processorPrice = 0.2*Ram;
        double ramPrice = 0.1 *Ram;
        double storagePrice = 0.05 *Storage;

        return basePrice + processorPrice + ramPrice +storagePrice;
    }
    public void printDetails(){
        System.out.println("Computer Details:");
        System.out.println("Processor:" +Proccesor);
        System.out.println("Ram:" +Ram);
        System.out.println("Storage:" +Storage);
    }


        public static void main(String args[]){
        Computer myComputer = new Computer("Dell" , 123, 76);

        myComputer.printDetails();
        }

}

