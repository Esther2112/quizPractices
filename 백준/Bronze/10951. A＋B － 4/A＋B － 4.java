import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String numbers = "";
        
        while((numbers = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(numbers, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append((a + b) + "\n");
        }

        System.out.println(sb);
    }
}