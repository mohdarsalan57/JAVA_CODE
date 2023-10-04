//import javax.sound.sampled.SourceDataLine;

class C {
    public C(){ 
        super();
    System.out.println("in a");
    }
    
    public C(int n){ 
          this();
    System.out.println("in a int ");
    }

}
class D  extends C{
    public D(){ 
          super();
    System.out.println("in B");
    }
    public D(int n){ 
          this();
    System.out.println("in b int");
    }
}


public class ThisConst {
public static void main(String[] args) {
    System.out.println("Arslan");
    D obj =new D(5);
}
}
