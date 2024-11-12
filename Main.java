import java.io.File;
import java.util.Scanner;

public class Main {
    public static int sticksNeeded(int [] x) {
        int sticksNeeded=0;
        int last=0;
        int secondLast=0;
        for (int i : x) {
            secondLast = last;
            if (i != 0) {
                last = i;
            }
            if (secondLast + i == 0) {
                sticksNeeded++;
            }
        }
        return sticksNeeded;
    }
    public static void main(String[] args) throws Exception {
        File f = new File("input.txt");
        Scanner scan = new Scanner(f);
        int[] log = new int[Integer.parseInt(scan.nextLine())];
        String g = scan.nextLine();
        String[] greenAnts = g.split(" ");
        String r = scan.nextLine();
        String[] redAnts = r.split(" ");
        for (String greenAnt : greenAnts) {
            log[(Integer.parseInt(greenAnt))] = 1;
        }
        for (String redAnt : redAnts) {
            log[(Integer.parseInt(redAnt))] = -1;
        }
        /*
        for(int a: log) {
            System.out.print(a + "    ");
        }

         */
        System.out.println();
        System.out.println("Sticks: " + sticksNeeded(log));
    }
}