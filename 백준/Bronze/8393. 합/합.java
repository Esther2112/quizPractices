import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static int sum(int num){
        return num == 1 ? 1 : num + sum(num - 1);
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(sum(num));
    }
}