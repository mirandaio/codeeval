import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            happyNumber(line);
        }
    }

    private static void happyNumber(String str) {
        int num = Integer.parseInt(str);
        HashSet<Integer> set = new HashSet<Integer>();
        int sum;
        int d;

        while(num != 1) {
            sum = 0;

            while(num > 0) {
                d = num % 10;
                sum += d * d;
                num /= 10;
            }

            if(set.contains(sum)) {
                System.out.println(0);
                return;
            }

            num = sum;
            set.add(sum);
        }

        System.out.println(1);
    }
}
