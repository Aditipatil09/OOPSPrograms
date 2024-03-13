import java.util.Scanner;

class Shirt {
    String Size ;
    String Color;
    double Price;

    public Shirt(String Size ,String Color, double Price){
        this.Size =Size;
        this.Color =Color;
        this.Price = Price;
    }
    public double calculateDiscount(){
        double discountPercentage=0;
        if(Size.equalsIgnoreCase("Small")){
            discountPercentage =0.05;
        } else if(Size.equalsIgnoreCase("Large")){
            discountPercentage =0.10;
        }
        return Price *discountPercentage;
    }
    public void ShirtDetails(){
        double discountedPrice = Price - calculateDiscount();


        System.out.println("Size:" +Size);
        System.out.println("Color:" +Color);
        System.out.println("Price:"+Price);
        System.out.println("Discount Price:" +discountedPrice);
    }

    public static void main(String args[]){
        Shirt myShirt = new Shirt("Small" , "Yellow", 1234);
        myShirt.ShirtDetails();
    }
}





