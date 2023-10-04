

public class Inheri extends AdvCalc
 {
    public static void main(String[] args) {
        VAdvCalc obj = new VAdvCalc();
        int r1 =obj.add(9,9);
        int r2 = obj.sub(7,3);
        int r3 =obj.mul(9,9);  // we r using here multilevel inheritance 
        int r4 = obj.div(18,4);
        double r5 = obj.power(3, 3); // cal-advvlac-vadvcalc-inheri .. it's levels 
        System.out.println(r1 + " " + r2 + " " + r3 +" " + r4 +" " +r5 );
    }
}
//java does nt support multiple inheritance 
// but in interface might be possible let see ahead

