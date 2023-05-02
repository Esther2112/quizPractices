import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> xmap = new HashMap<>();
        Map<Integer, Integer> ymap = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(xmap.containsKey(x)){
                xmap.put(x, xmap.get(x) + 1);
            } else {
                xmap.put(x, 1);
            }

            if(ymap.containsKey(y)){
                ymap.put(y, ymap.get(y) + 1);
            } else {
                ymap.put(y, 1);
            }

        }

        Set<Integer> xset = xmap.keySet();
        Iterator<Integer> xiter = xset.iterator();
        while(xiter.hasNext()){
            Integer xkey = xiter.next();
            if(xmap.get(xkey) == 1){
                System.out.print(xkey + " ");
            }
        }

        Set<Integer> yset = ymap.keySet();
        Iterator<Integer> yiter = yset.iterator();
        while(yiter.hasNext()){
            Integer ykey = yiter.next();
            if(ymap.get(ykey) == 1){
                System.out.print(ykey);
            }
        }
    }

}


