public class PascalsTriangleTest {
    public static void main(String[] args) {
        testCalNextVal();
    }

    public static void testCalNextVal() {
        int[][] testCases = {
                {0, 0, 1},
                {4, 2, 6},
                {6, 3, 20}
        };

        for (int[] testCase : testCases) {
            int n = testCase[0];
            int k = testCase[1];
            int expected = testCase[2];
            int result = PascalsTriangle.calNextVal(n, k);

            if (result == expected) {
                System.out.println("Test Passed: C(" + n + ", " + k + ") = " + result);
            } else {
                System.out.println("Test Failed: C(" + n + ", " + k + ") - Expected: " + expected + ", Got: " + result);
            }
        }
    }
}
