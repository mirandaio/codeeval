/* Sample code to read in test cases: */
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            fizzBuzz(line);
        }
    }

    private static void fizzBuzz(String line) {
        StringBuilder result = new StringBuilder();
        String[] parts = line.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        int n = Integer.parseInt(parts[2]);

        for(int i = 1; i <= n; i++) {
            if(i % x == 0 && i % y == 0)
                result.append("FB ");
            else if(i % x == 0)
                result.append("F ");
            else if(i % y == 0)
                result.append("B ");
            else
                result.append(i + " ");
        }

        System.out.println(result.toString().trim());
    }
}
