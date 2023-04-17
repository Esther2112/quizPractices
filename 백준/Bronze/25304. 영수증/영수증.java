import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tot = sc.nextInt();
        int amo = sc.nextInt();
        int num, price; 
        int sum = 0;
        //int[][] rec = new int[][] {}; 
       for(int i = 0; i < amo; i++) {
    	   num = sc.nextInt();
    	   price = sc.nextInt();
    	   //rec[i] = new int[] {num, price};
    	   sum += num*price;
       }
       sc.close(); 
        
        
        if(sum == tot) System.out.println("Yes");
        else System.out.println("No");
    }
}