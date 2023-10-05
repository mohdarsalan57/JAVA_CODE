
class Ars{
    public void show()
    {System.out.println("in show");}
}
public class AnonInner {
    public static void main(String[] args)
     {
      Ars obj = new Ars()
      { // this called Anonymous class 
      public void show()
    {System.out.println("in  style show");}
      };
    obj.show();
    }  
}
    


