
public class N3dim {
    public static void main(String[] args) {
        System.out.println("Arslan");

        int num[][][] = new int[3][4][5];

        for (int i = 0; i<num.length; i++)
         {
            for (int j = 0; j<num[i].length; j++){
 
            for (int k = 0; k<num[i][j].length; k++)
             {
                num[i][j] [k]= (int)(Math.random() * 10);
             }
            }
        }

        

        for (int[][] n : num) {
            for (int[] m : n) {
                for (int p : m) {
                    System.out.print(p + " ");
                }
                System.out.print("| ");
            }
            System.out.println();
        }
    }
}
