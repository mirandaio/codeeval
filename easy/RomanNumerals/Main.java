import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            toRoman(line);
        }
    }

    private static void toRoman(String number) {
        StringBuilder roman = new StringBuilder();
        char[] ones =  {'I', 'X', 'C', 'M'};
        char[] fives = {'V', 'L', 'D', 'M'};
        char[] tens =  {'X', 'C', 'M', 'M'};
        int len = number.length();

        for(int i = 0; i < len; i++) {
            char one = ones[len - 1 - i];
            char five = fives[len - 1 - i];
            char ten = tens[len - 1 - i];
            int d = number.charAt(i) - '0';

            if(d == 9) {
                roman.append(one);
                roman.append(ten);
            } else if(d >= 5 && d < 9) {
                roman.append(five);
                for(int j = 0; j < d - 5; j++)
                    roman.append(one);
            } else if(d == 4) {
                roman.append(one);
                roman.append(five);
            } else {
                for(int j = 0; j < d; j++)
                    roman.append(one);
            }
        }

        System.out.println(roman.toString());
    }
}
