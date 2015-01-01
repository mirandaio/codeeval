import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            multiplyLists(line);
        }
    }

    private static void multiplyLists(String line) {
        String[] parts = line.split("\\|");
        String[] list1 = parts[0].trim().split(" ");
        String[] list2 = parts[1].trim().split(" ");

        for(int i = 0; i < list1.length; i++)
            System.out.print(Integer.parseInt(list1[i]) * 
                Integer.parseInt(list2[i]) + " ");

        System.out.println();
    }
}
