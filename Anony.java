class  A{
    public A(){
        System.out.println("obj created");
    
    }
public void show(){
    System.out.println("IN a Show");
}
}

public class Anony {
    public static void main(String[] args) {
        System.out.println("Arslan");
        new A().show();      //Anonymous object 
        //new obj.A();
    } // it can be use only one time 
    
}
