import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int round = Integer.parseInt(br.readLine());
        int square = 1;
        int dot = 4;

        for (int i = 1; i <= round; i++) {
            dot = (int) Math.pow((dot - square), 2);
            square = (int) Math.pow(4, i);
        }
        
        System.out.println(dot);
        
    }
}


