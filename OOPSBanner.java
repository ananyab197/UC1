import java.util.HashMap;

public class OOPSBanner {

    public static void main(String[] args) {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        map.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        map.put('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });

        
        String word = "OOPS";

        
        for (int i = 0; i < 5; i++) {
            for (char ch : word.toCharArray()) {
                System.out.print(map.get(ch)[i] + "   ");
            }
            System.out.println();
        }
    }
}