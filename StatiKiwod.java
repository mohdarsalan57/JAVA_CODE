class Mobile {
    //instance variables 
    String brand;
    int price;
    static String name;
    public void  show()
    // inside a functions/method call the vriable r call as local variables
    {
        System.out.println(brand + " " + price + " "  + name );
    }

}

public class StatiKiwod {
   public static void main(String[] args) {
    System.out.println("*");
    Mobile obj1 = new Mobile();
    obj1.brand ="Samsung";
    obj1.price =2000;
    obj1.name ="Smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand ="Apple";
    obj2.price =4000;
    obj2.name ="Smartphone";

     Mobile obj3 = new Mobile();
    obj3.brand ="Mi";
    obj3.price =5000;
    obj3.name ="Smartphone";

    obj1.name = "Phone";
    obj1.show();
    obj2.show();
    obj3.show();



   } 
}
