import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayThreePartTwo {
    public static void main(String[] args) throws FileNotFoundException {

        // Variables
        List<String> list = new ArrayList<>();
        int result = 0;

        // Read Inputs
        Scanner sc = new Scanner(new File("src/input.txt"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) list.add(line);
        }

        String[] arr = list.toArray(new String[0]);


        for (String s : arr) {
            int var1 ;
            int var2 ;
            int var3 ;
            long max = 0;
            int temp = s.length() - 12 ;

            for (int i = 0 ; i < s.length() ; i++) {
                long num = 0 ;
                for (int j = i ; j < s.length() ; j++ ) {
                    var1 = (s.charAt(i) - '0');
                    var2 = (s.charAt(i + 1) - '0');
                    var3 = (s.charAt(i + 2) - '0');
                    num += value * 10 ;
                }
                if (num > max) {max = num;}
            }
            result += max;
        }


        System.out.println(result);
    }
}
