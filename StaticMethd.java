class Mobile {
    //instance variables 
    String brand;
    int price;
    static String name;

    public void  show() //instance method 
    // inside a functions/method call the vriable r call as local variables
    {
        System.out.println(brand + " " + price + " "  + name );
    }
    public static  void show1(Mobile obj) {
        System.out.println(obj.brand + " " + obj.price + " "  + name );
    }

}

public class StaticMethd {
   public static void main(String[] args) {
    System.out.println("*");
    Mobile obj1 = new Mobile();
    obj1.brand ="Samsung";
    obj1.price =2000;
    Mobile.name ="Smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand ="Apple";
    obj2.price =4000;
    Mobile.name ="Smartphone";

     Mobile obj3 = new Mobile();
    obj3.brand ="Mi";
    obj3.price =5000;
    Mobile.name ="Smartphone";

    Mobile.name = "Phone";
    obj1.show();
    obj2.show();
    obj3.show();
    Mobile.show1(obj1);


   } 
}
