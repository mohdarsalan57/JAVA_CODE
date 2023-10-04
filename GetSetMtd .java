class GetSetMtd  {
    private int age ;
private String name ;
public void setAge(int age) {
    this.age = age;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public String getName() {
    return name;
}
}
 // encapsulation use and we r learns variable r private 
// access by methods 
 class Encaps {
    public static void main(String[] args) {
        GetSetMtd  obj= new GetSetMtd();
        obj.setAge(32);
        obj.setName("Arslan");
        System.out.println(obj.getName() + " :" + obj.getAge());

    }
}
