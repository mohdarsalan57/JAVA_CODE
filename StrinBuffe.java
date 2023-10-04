public class StrinBuffe {
    public static void main(String[] args) {

        System.out.println("*arslan");
        StringBuffer sb = new StringBuffer("m_arslan ");
        sb.append("rbn");
        //System.out.println(sb);
        sb.deleteCharAt(4);             
        System.out.println(sb);     
        System.out.println(sb.capacity());
    }
}
