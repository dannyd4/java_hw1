import java.util.Scanner;

public class hw1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int T = n*(n + 1)/2;
        System.out.printf("T = %d", T);
    }
}

