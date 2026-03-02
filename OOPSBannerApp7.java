import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp7 {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = initializePatterns();

        String word = "OOPS";
        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern pattern = patternMap.get(ch);
                lineBuilder.append(pattern.getPattern()[i]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }

    private static Map<Character, CharacterPattern> initializePatterns() {

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        map.put('P', new CharacterPattern('P', new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        }));

        map.put('S', new CharacterPattern('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        }));

        return map;
    }

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}