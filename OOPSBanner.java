import java.util.*;

public class OOPSBanner {

   
    static class CharacterPattern {
        private char character;
        private String[] pattern;


        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

       
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });

        
        Map<Character, CharacterPattern> map = new HashMap<>();
        map.put('O', O);
        map.put('P', P);
        map.put('S', S);

        String word = "OOPS";

        
        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(map.get(c).getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}