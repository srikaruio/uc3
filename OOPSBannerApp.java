public class OOPSBannerApp {
    public static void main(String[] args) {

        // UC4: Render OOPS as Banner using String Array and Loop

        // Step 1: Create a String array to store all 7 lines of the OOPS banner
        String[] bannerLines = new String[7];

        // Step 2: Populate each line using String.join()
        // Each segment is 5 characters wide representing O, O, P, S respectively
        bannerLines[0] = String.join("", " *** ", " *** ", " *** ", " *** ");
        bannerLines[1] = String.join("", "*   *", "*   *", "*   *", "*   *");
        bannerLines[2] = String.join("", "*   *", "*    ", "*   *", "*    ");
        bannerLines[3] = String.join("", "*   *", "*    ", "*****", " *   ");
        bannerLines[4] = String.join("", "*   *", "*   *", "*    ", "  *  ");
        bannerLines[5] = String.join("", "*   *", "*   *", "*    ", "*   *");
        bannerLines[6] = String.join("", " *** ", " *** ", "*    ", " *** ");

        // Step 3: Use a for-each loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
