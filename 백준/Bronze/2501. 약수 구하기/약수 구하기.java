import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 1; i <= num1; i++) {
            if(num1 % i == 0){
                count++;
            }
            if(count == num2){
                System.out.println(i);
                break;
            }
            if(i == num1 && count < num2){
                System.out.println(0);
            }
        }


    }

}


