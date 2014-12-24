import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            mod(line);
        }
    }

    private static void mod(String line) {
        String[] parts = line.split(",");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        System.out.println(n - (n / m) * m);
    }
}
