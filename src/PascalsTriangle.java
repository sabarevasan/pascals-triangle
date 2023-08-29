import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows to generate Pascal's Triangle : ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(calNextVal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int calNextVal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        }
        return calNextVal(i - 1, j - 1) + calNextVal(i - 1, j);
    }
}
