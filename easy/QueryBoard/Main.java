import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        byte[][] board = new byte[256][256];

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            operate(line, board);
        }
    }

    private static void operate(String op, byte[][] board) {
        String[] parts = op.split(" ");
        short i;
        short j;
        byte x;
        short sum;

        switch(parts[0]) {
            case "SetRow":
                i = Short.parseShort(parts[1]);
                x = Byte.parseByte(parts[2]);
                for(j = 0; j < 256; j++)
                    board[i][j] = x;
                break;
            case "SetCol":
                j = Short.parseShort(parts[1]);
                x = Byte.parseByte(parts[2]);
                for(i = 0; i < 256; i++)
                    board[i][j] = x;
                break;
            case "QueryRow":
                sum = 0;
                i = Short.parseShort(parts[1]);
                for(j = 0; j < 256; j++)
                    sum += board[i][j];
                System.out.println(sum);
                break;
            default:
                sum = 0;
                j = Short.parseShort(parts[1]);
                for(i = 0; i < 256; i++)
                    sum += board[i][j];
                System.out.println(sum);
                break;
        }
    }
}
