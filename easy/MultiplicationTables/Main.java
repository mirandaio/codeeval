import java.io.*;

public class Main {
    public static void main (String[] args) {
        for(int i = 1; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                StringBuilder result = new StringBuilder();
                result.append(i * j);
                while(result.length() < 4)
                    result.insert(0, ' ');

                System.out.print(result);
            }

            System.out.println();
        }
    }
}
