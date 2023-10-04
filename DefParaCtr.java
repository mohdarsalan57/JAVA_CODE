//import javax.sound.midi.Soundbank;

class DE{
 private int age ;
    private String name ;

    public DE() // defualt constructor 
     {
        age=12;
        name="arslan-java_coder";
        
     }
     public DE(int  a, String n) // Parametarised Constructor
     {
        age=a;
        name=n;
        
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
public class DefParaCtr {
    public static void main(String[] args) {
        DE obj  = new DE (); // default constructor
        DE obj1 = new DE(22, "java coder"); //Parameteerised
        System.out.println(obj.getName() + " :" + obj.getAge());
         System.out.println(obj1.getName() + " :" + obj1.getAge());
   //obj.setAge(24);

    }
    
}
