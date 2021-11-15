import java.util.Scanner;
class SumElements {
    public static void main(String[] args) {
        double input = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter numbers for 2D array and press \"Enter\" evrey time");

       

        double[][] Numbers = new double [3][4];
        
        for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
          Numbers[i][j]= scan.nextDouble();
        
        }
        }
        
         for(int i=0;i<3;i++){
          System.out.println();
        for(int j=0;j<4;j++){
          System.out.print( Numbers[i][j]+" ");
        
        }
        }
        
        
        
        System.out.println("\n\nThe sum of the first column is:"+(Numbers[0][0]+Numbers[1][0]+Numbers[2][0]));
        System.out.println("The sum of the second column is:"+(Numbers[0][1]+Numbers[1][1]+Numbers[2][1]));
        System.out.println("The sum of the Third column is:"+(Numbers[0][2]+Numbers[1][2]+Numbers[2][2]));
        System.out.println("The sum of the fourth column is:"+(Numbers[0][3]+Numbers[1][3]+Numbers[2][3]));

        
        

}
}
