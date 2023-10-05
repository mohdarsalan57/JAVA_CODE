 class Ao{
    public static Ao.Bw Bw;
    int age ;
    public void show()
    {
        System.out.println("A class ");
    }
     static class Bw
     {
       public void Config()
       {
        System.out.println("Configure");
       } 
     }
    } // inner class and static class 
public class  Inner
{
    public static void main(String[] args) {
         Ao obj = new Ao();
         obj.show();

            Ao.Bw obj1 = new Ao.Bw();
            obj1.Config();
    }
}

