public class MoneyChanger {

    /**
     * Calculates the least necessary amount of banknotes and coins
     *
     * @param moneyTypes the values of the banknotes and coins
     * @param amount     of the money we want to change
     * @return the number of banknotes and coins
     */
    public int[] changer(int[] moneyTypes, int amount) {
        if (amount % moneyTypes[moneyTypes.length - 1] != 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        int[] result = new int[moneyTypes.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = amount / moneyTypes[i];
            amount -= result[i] * moneyTypes[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] moneyTypes = {500, 200, 100, 50, 20, 10, 5};
        int[] result = new MoneyChanger().changer(moneyTypes, 4335);
        for (int i = 0; i < moneyTypes.length; i++) {
            System.out.println(result[i]);
        }
    }

}
