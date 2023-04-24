import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num ; i++){
            for(int j = 1; j <= num; j++){
                if(j >= (num - i + 1)){
                    System.out.print("*");
                }else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}