import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sb.append("         ,r'\"7\n");
        sb.append("r`-_   ,'  ,/\n");
        sb.append(" \\. \". L_r'\n");
        sb.append("   `~\\/\n");
        sb.append("      |\n");
        sb.append("      |\n");

        System.out.println(sb);
    }
}