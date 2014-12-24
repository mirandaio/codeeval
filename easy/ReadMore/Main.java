import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            readMore(line);
        }
    }

    private static void readMore(String line) {
        if(line.length() <= 55) {
            System.out.println(line);
        } else {
            byte i = 39;
            StringBuilder result = new StringBuilder();

            while(i >= 0 && line.charAt(i) != ' ')
                i--;

            i = i == -1 ? 40 : i;
            result.append(line.substring(0, i));
            result.append("... <Read More>");
            System.out.println(result.toString());
        }
    }
}
