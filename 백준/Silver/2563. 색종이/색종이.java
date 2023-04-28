import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[][] areaArr = new int[100][100];
        int area = 0;

        for (int i = 0; i < count; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    areaArr[j][k] = 1;
                }
            }

        }

        for (int i = 0; i < areaArr.length; i++) {
            for (int j = 0; j < areaArr[i].length; j++) {
                if (areaArr[i][j] == 1) {
                    area += 1;
                }
            }
        }

        System.out.println(area);

    }


}