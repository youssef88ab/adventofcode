import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayOnePartTwo {

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

                // if Position Right
                if (dir == 'R') {
                    for (int i = 0; i < value; i++) {
                        // move first
                        start = (start + 1) % 100;

                        // check
                        if (start == 0) result++;
                    }
                }

                // if Position Left
                else if (dir == 'L') {
                    for (int i = 0; i < value; i++) {
                        // move first
                        start = (start - 1 + 100) % 100;

                        // check
                        if (start == 0) result++;
                    }
                }
            }
            System.out.println("Password: " + result);
        }

}
