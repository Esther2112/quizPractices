import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int xMax = -10000;
        int yMax = -10000;
        int xMin = 10000;
        int yMin = 10000;

        int square = 0;

        for (int i = 0; i < n; i++) {
            if (n == 1) {
                System.out.println(square);
                break;
            } else {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int xNum = Integer.parseInt(st.nextToken());
                int yNum = Integer.parseInt(st.nextToken());
                if (xMax < xNum) {
                    xMax = xNum;
                }
                if (xMin > xNum) {
                    xMin = xNum;
                }
                if (yMax < yNum) {
                    yMax = yNum;
                }
                if (yMin > yNum) {
                    yMin = yNum;
                }
            }
            if (i == (n - 1)) {
                System.out.println((xMax - xMin) * Math.abs(yMax - yMin));
            }
        }

    }

}


