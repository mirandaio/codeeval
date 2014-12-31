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
        String[] parts = line.split(",");
        String s = parts[0];
        char c = parts[1].charAt(0);
        int i;

        for(i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == c)
                break;
        }

        System.out.println(i);
    }
}
