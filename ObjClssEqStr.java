
class Laptop{
    String model;
    int price;
    public String toString(){
        //return "Arslan_rbn";
        return model + ":" + price;
    }
// clip 60 is done through the code ..
}
public class ObjClssEqStr {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Ideapad";
        obj.price = 80000;
        System.out.println(obj);
    }
    
}
