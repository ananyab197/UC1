public class OOPSBanner {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    
    public static String[] getO() {
        return new String[] {
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }
    public static String[] getP() {
        return new String[] {
            "PPPP ",
            "P   P",
            "PPPP ",
            "P    ",
            "P    "
        };
    }
    public static String[] getS() {
        return new String[] {
            " SSSS",
            "S    ",
            " SSS ",
            "    S",
            "SSSS "
        };
    }
}
