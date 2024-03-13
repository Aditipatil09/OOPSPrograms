import java.util.Scanner;

class Tv{
    String Brand;
    int Size ;
    double Price;

    public Tv(String Brand , int Size ,double Price){
        this.Brand=Brand ;
        this.Size =Size;
        this.Price =Price;
    }
    public double calculatediscount(){
        double discount=0.0;
        if(Size >=50){
            discount =0.15;
        }else if (Size>=40){
            discount=0.10;
        }
        return discount * Price;
    }
    public void printTvInfo(){
        System.out.println("Brand:" +Brand);
        System.out.println("Size:" +Size+ "in inches");
        System.out.println("Price:" +Price);
        System.out.println("discount Price:" +(Price- calculatediscount()));
    }

}
public class TVTest {
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the Brand of the TV:");
        String Brand = scanner.nextLine();
        System.out.println("Enter the Size of the Tv:");
        int Size = scanner.nextInt();
        System.out.println("Enter the Price of the Tv:");
        double Price =scanner.nextDouble();

        Tv myTv= new Tv (Brand , Size , Price);

        System.out.println("Tv information:");
        myTv.printTvInfo();

        scanner.close();

    }
}
