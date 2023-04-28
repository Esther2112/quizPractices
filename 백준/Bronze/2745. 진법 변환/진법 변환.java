import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String numbers = st.nextToken();
        int origin = Integer.parseInt(st.nextToken());
        int byNum = 1;
        int decimal = 0;
        int toInt;

        for (int i = numbers.length() - 1; i >= 0 ; i--) {
            if((int)numbers.charAt(i) - 55 > 9){
                toInt = numbers.charAt(i) - 55;
            }else {
                toInt = numbers.charAt(i) - '0';
            }
            decimal += toInt * byNum;
            byNum *= origin;

        }
        System.out.println(decimal);
    }

}


