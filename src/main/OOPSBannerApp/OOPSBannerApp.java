/**
 * UC5: Render OOPS Banner App using inline Array Initialization and Enhanced For Loop
 *
 * This use case extends UC4 by utilizing inline array initialization to store the
 * lines of the OOPS banner. An enhanced for loop is then used to iterate through
 * the array and print each line of the banner to the console.
 *
 *
 *
 * @author Krishna
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
                String.join(" ", "   ***   ", "    ***    ", "******   ", "  ****** "),
                String.join(" ", " **   ** ", "  **   **  ", "**    ** ", "**       "),
                String.join(" ", "**     **", " **     ** ", "**    ** ", "**       "),
                String.join(" ", "**     **", " **     ** ", "*******  ", " ******* "),
                String.join(" ", "**     **", " **     ** ", "**       ", "       **"),
                String.join(" ", " **   ** ", "  **   **  ", "**       ", "       **"),
                String.join(" ", "   ***   ", "    ***    ", "**       ", " ******* "),
        };
        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}