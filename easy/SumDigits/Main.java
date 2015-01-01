import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            sumDigits(line);
        }
    }

    private static void sumDigits(String str) {
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
