import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int startNum;
        int endNum = 1;

        for (int i = 0; i < n; i++) {
            startNum = endNum + 1;
            endNum += (6 * i);
            if(n == 1){
                System.out.print(1);
            }
            if(n >= startNum && n <= endNum){
                System.out.print(i + 1);
                break;
            }

        }

    }

}


