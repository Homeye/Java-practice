public class GoogleTestResult {

    /**
     * Helper class for the GoogleTest class.
     */

    private int num1;

    private int num2;

    public GoogleTestResult(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "GoogleTestResult{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

}
