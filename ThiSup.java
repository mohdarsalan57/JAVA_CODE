
//import javax.sound.sampled.SourceDataLine;

class A {
    public A(){ 
        super();
    System.out.println("in a");
    }
    
    public A(int n){ 
          super();
    System.out.println("in a int ");
    }

}
class B  extends A{
    public B(){ 
          super();
    System.out.println("in B");
    }
    public B(int n){ 
          super(n);
    System.out.println("in b int");
    }
}

public class ThiSup {
    public static void main(String[] args) {
        B obj = new B(5);  
    }
    
}
