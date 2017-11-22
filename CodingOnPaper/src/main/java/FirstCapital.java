public class FirstCapital {

    /**
     * Capitalizes words along the separating character
     *
     * @param name      the String we want to change
     * @param separator
     * @return the capitalized String
     */
    public String firstCapital(String name, String separator) {
        StringBuilder result = new StringBuilder();
        String[] splitted = name.toLowerCase().split(separator);
        for (String line : splitted) {
            if (!line.equals("")) {
                char up = Character.toUpperCase(line.charAt(0));
                result.append(line.replace(line.charAt(0), up)).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new FirstCapital().firstCapital("JOHN.....dOe", "\\."));
    }

}
