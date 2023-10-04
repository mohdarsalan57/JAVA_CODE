class Mobile {
    String brand;
    int price;
    static String name;
    public Mobile()
    {
        brand ="";
        price = 200;
        System.out.println("in Constructor");
    }
    static {
        name = "Phone";
        System.out.println("I  static block");
    }

    public void  show() //instance method 
    // inside a functions/method call the vriable r call as local variables
    {
        System.out.println(brand + " " + price + " "  + name );
    }    
}
public class StatiBlk
{
   public static void main(String[] args) throws ClassNotFoundException {
    //System.out.println("*");
    Class.forName("Mobile");

//     Mobile obj1 = new Mobile();
//     obj1.brand ="Samsung";
//     obj1.price =2000;
//     Mobile.name ="Smartphone";
//    // Mobile.name = "Phone";
//     obj1.show();
    
   }
}
