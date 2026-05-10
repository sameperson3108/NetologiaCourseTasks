package part1;

public class Pattern {

    public static final String TEXT = "aaababaabaaaabaabaabaabaaabaabbaaabbaab";
    public static final String PATTERN = "aab";
    static void main() {
        int count = 0;
        for (int i = 0; i <= TEXT.length() - PATTERN.length(); i++) {
            boolean matches = true;
            for (int j = 0; j < PATTERN.length(); j++) {
                if (PATTERN.charAt(j) != TEXT.charAt(i + j)) {
                    matches = false;
                    break;
                }
            }

            if (matches == true) count++;
        }

        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");

    }
}
