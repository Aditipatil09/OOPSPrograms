import java.util.Scanner;

class Furniture{
    String Type ;
    String Material;
    int Price;

    public Furniture( String Type , String Material ,int Price){
        this.Type =Type;
        this.Material=Material;
        this.Price = Price;
    }
    public double calculateDiscount() {
        double discountPercentage = 0;

        if(Material.equalsIgnoreCase("wood")){
            discountPercentage =0.1;
        } else if(Material.equalsIgnoreCase("Metal")){
            discountPercentage =0.05;
        }
        return Price * discountPercentage;
    }

    public void FurnitureInfo(){
        double discountPrice = Price - calculateDiscount();

        System.out.println("Furniture Details:");
        System.out.println("Type:" +Type);
        System.out.println("Material:"+Material);
        System.out.println("Price:"+Price);
        System.out.println("Discount Price:" +discountPrice);
    }
    public static void main(String args[]){
        Furniture myFurniture = new Furniture ("Chair" ,"Wood" , 123);

        myFurniture.FurnitureInfo();
    }
}


