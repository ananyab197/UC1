public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] banner = {
            String.join(" ", "O", "O", "P", "P", "S", "S"),
            String.join(" ", "O", "O", "P", "P", "S", "S"),
            String.join(" ", "O", "O", "P", "P", "S", "S"),
            String.join(" ", "O", "O", "P", "P", "S", "S"),
            String.join(" ", "O", "O", "P", "P", "S", "S"),
            String.join(" ", "O", "O", "P", "P", "S", "S"),
            String.join(" ", "O", "O", "P", "P", "S", "S")
        };

       
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
