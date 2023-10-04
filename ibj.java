class Computer{
    public void playmusic()
    {
    System.out.println("music playing");
    }
    
    

public  String getMepan(int cost) {
if(cost>=10)
    return "pen";
else 
return "nothing";
}
}
public class ibj {
    public static void main(String[] args) 
    {
        Computer obj = new Computer();
        obj.playmusic();
        String str =obj.getMepan(20);
        System.out.println( str);
        
    }
}
