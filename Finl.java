//final - vaiable, methods, class 
class Functionn{
      public void show(){
        System.out.println("Arslan Function");
    }
    public void Add(int a, int b)
    {
       System.out.println(a+b);
    }
} // if we tru to method final like show so it's can't acceptable 
class Advfunctionn extends Functionn{
    public void show()
    {
        System.out.println("new try final methods");
    }

}
public class Finl {

    public static void main(String[] args) {
        Advfunctionn obj = new Advfunctionn();
        obj.show();
        obj.Add(4,8);
        
    }
}