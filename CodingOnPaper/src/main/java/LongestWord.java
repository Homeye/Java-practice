public class LongestWord {

    /**
     * Calculate the length of the longest word in a string
     *
     * @param str which we investigate
     * @return the length of the longest word
     */
    public int longestWord(String str) {
        if (str == null || str.trim().equals("")) {
            return 0;
        }
        int result = 0;
        int tempResult = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                tempResult++;
            } else {
                if (tempResult > result) {
                    result = tempResult;
                    tempResult = 0;
                } else {
                    tempResult = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LongestWord().longestWord("sdfsdff.edff arq"));

        String s = null;
        System.out.println(new LongestWord().longestWord(s));
    }

}
