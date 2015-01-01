import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            swapCase(line);
        }
    }

    private static void swapCase(String line) {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if(Character.isUpperCase(c))
                str.append(Character.toLowerCase(c));
            else
                str.append(Character.toUpperCase(c));
        }

        System.out.println(str);
    }
}
