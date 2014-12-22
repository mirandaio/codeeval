import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(Integer.parseInt(line, 16));
        }
    }

    private static void hexToDecimal(String str) {
        int num = 0;
        int mul = 1;

        for(int i = str.length() - 1; i >= 0; i--) {
            char d = str.charAt(i);

            switch(d) {
                case 'a':
                    num += 10 * mul;
                    break;
                case 'b':
                    num += 11 * mul;
                    break;
                case 'c':
                    num += 12 * mul;
                    break;
                case 'd':
                    num += 13 * mul;
                    break;
                case 'e':
                    num += 14 * mul;
                    break;
                case 'f':
                    num += 15 * mul;
                    break;
                default:
                    num += (d - 48) * mul;
                    break;
            }

            mul *= 16;
        }

        System.out.println(num);
    }
}
