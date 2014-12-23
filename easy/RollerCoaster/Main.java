import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            rollerCoaster(line);
        }
    }

    private static void rollerCoaster(String line) {
        char[] result = new char[line.length()];
        boolean toUpper = true;

        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if(Character.isLetter(c)) {
                if(toUpper)
                    c = Character.toUpperCase(c);
                else
                    c = Character.toLowerCase(c);

                toUpper = !toUpper;
            }

            result[i] = c;
        }

        System.out.println(result);
    }
}
