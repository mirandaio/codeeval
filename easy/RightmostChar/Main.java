import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            rightmostChar(line);
        }
    }

    private static void rightmostChar(String line) {

        for(int i = line.length() - 1; i >= 0; i--) {
        }

        System.out.println(i);
    }
}
