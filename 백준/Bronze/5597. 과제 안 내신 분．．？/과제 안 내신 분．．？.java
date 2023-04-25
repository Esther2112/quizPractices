import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr28 = new int[28];
        int[] arr30 = new int[30];
        int[] arr2 = new int[2];
        for (int i = 0; i < arr28.length; i++) {
            arr28[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr30.length; i++) {
            arr30[i] = i + 1;
        }

        for (int i = 0; i < arr30.length; i++) {
            for(int j = 0; j < arr28.length; j++){
                if(arr30[i] == arr28[j]){
                    break;
                }
                if(j == arr28.length - 1){
                    if(arr2[0] == 0) {
                        arr2[0] = arr30[i];
                    }else {
                        arr2[1] = arr30[i];
                    }
                }
            }
        }

        if(arr2[0] > arr2[1]){
            int temp = arr2[0];
            arr2[0] = arr2[1];
            arr2[1] = temp;
        }

        for (int i : arr2) {
            System.out.println(i);
        }
    }
}