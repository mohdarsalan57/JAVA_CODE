
class Aa{
    public void show()
    {
System.out.println("in A");
    }
    public void confg()
    {
        System.out.println("cinfig");
    }  
}
class Ba  extends Aa // this is for method
                     //overriding and it's a skip the parent methods and runn it's own 
   {                    //fintion with same name  
       public void show()
        {
        System.out.println("in B");
         } 
    }
public class MOverRid {
    public static void main(String[] args) {
        Ba obj = new Ba();
        obj.show();
        obj.confg();
    }
}
