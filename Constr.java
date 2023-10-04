 class Gt {
    
    private int age ;
    private String name ;

    public Gt()
     {
        age=12;
        name="arslan-coder";
        
     }
     public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class Constr
{
public static void main(String[] args) {
    Gt obj = new Gt();
   // Gt obj1 = new Gt();
    // obj.setAge(25);   // if this not created so constructor 
    // obj.setName("meh");   // automatically calls
    System.out.println(obj.getName() + " :" + obj.getAge());
    // if u ibject is created so constructor value not print or calls
}
}

