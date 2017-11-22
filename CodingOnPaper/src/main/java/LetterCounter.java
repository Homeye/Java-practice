public class LetterCounter {

    /**
     * Find out how many vowels and syllables in a given word
     *
     * @param word
     * @return the number of vowels and syllables
     */
    public String counter(String word) {
        String vowels = "aáeéiíoóöőuúüű";
        String low = word.toLowerCase();
        int vSum = 0;
        int sSum = 0;
        for (int i = 0; i < low.length(); i++) {
            if (vowels.indexOf(low.charAt(i)) != -1) {
                vSum++;
            } else {
                sSum++;
            }
        }
        return "Number of vowels: " + vSum + "\nNumber of syllables: " + sSum;
    }

    public static void main(String[] args) {
        System.out.println(new LetterCounter().counter("árvÍztűRő"));
    }

}
