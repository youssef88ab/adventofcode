import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Variables
        List<String> list = new ArrayList<>();
        int result = 0;
        int start = 50;
        int max = 99;

        // Read Inputs
        Scanner sc = new Scanner(new File("src/input.txt"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) list.add(line);
        }

        String[] arr = list.toArray(new String[0]);

        for (String s : arr) {
            char dir = s.charAt(0);
            int value = Integer.parseInt(s.substring(1));

            if (start == 0) { result++;}

            // if Position Right
            if (dir == 'R') {
                start = start + value%100;
                while (start > max ) {
                    start -= 100;
                }
            }

            // if Position Left
            else if (dir == 'L') {
               start = start - value%100;
               while (start < 0 ) {
                   start += 100;
               }
            }
        }
        System.out.println("Password: " + result);
    }
}