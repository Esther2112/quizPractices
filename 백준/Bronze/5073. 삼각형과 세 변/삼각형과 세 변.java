import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max, min;
        int[] triangle = new int[3];
        int sum = 0;

        while(true) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 3; i++) {
                triangle[i] = Integer.parseInt(st.nextToken());
                sum += triangle[i];
            }

            if(sum == 0) break;

            max = triangle[0];
            min = triangle[0];
            for (int i : triangle) {
                if (i >= max) {
                    max = i;
                } else if (i <= min) {
                    min = i;
                }
            }
            if(sum - max <= max){
                System.out.println("Invalid");
            } else if (max == min) {
                System.out.println("Equilateral");
            } else if (sum - max == 2 * min || sum - min == 2 * max) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

            sum = 0;
        }
    }

}


