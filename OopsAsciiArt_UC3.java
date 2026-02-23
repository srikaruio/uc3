/**
 * UC3 - Render OOPS as Banner using String.join()
 *
 * Goal: Refactor UC2 by replacing + operator concatenation with String.join()
 *       to improve memory efficiency and code readability.
 *
 * Key Concepts:
 *   1. String.join()       - Static method joining strings with a delimiter
 *   2. Memory Efficiency   - Fewer intermediate String objects vs + operator
 *   3. String Immutability - Each + creates a new object; join() avoids this
 *   4. Method Invocation   - Using static methods from the String class
 *   5. Refactoring         - Same output as UC2, better internal approach
 *
 * Refactoring Change:
 *   UC2:  System.out.println(O1 + gap + O1 + gap + P1 + gap + S1);
 *   UC3:  System.out.println(String.join("  ", O1, O1, P1, S1));
 *
 * String.join(delimiter, elements...)
 *   - delimiter : string placed BETWEEN each element
 *   - elements  : the strings to join together
 */
public class OopsAsciiArt {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // Define each letter row as a 9-character wide string
        // -------------------------------------------------------

        // Letter: O (rows 1-7)
        String O1 = " ******* ";
        String O2 = "*       *";
        String O3 = "*       *";
        String O4 = "*       *";
        String O5 = "*       *";
        String O6 = "*       *";
        String O7 = " ******* ";

        // Letter: P (rows 1-7)
        String P1 = "******** ";
        String P2 = "*       *";
        String P3 = "*       *";
        String P4 = "******** ";
        String P5 = "*        ";
        String P6 = "*        ";
        String P7 = "*        ";

        // Letter: S (rows 1-7)
        String S1 = " ******* ";
        String S2 = "*       *";
        String S3 = "*        ";
        String S4 = " ******* ";
        String S5 = "        *";
        String S6 = "*       *";
        String S7 = " ******* ";

        // -------------------------------------------------------
        // Print the OOPS Banner using String.join()
        // Delimiter "  " (2 spaces) acts as gap between letters
        // UC2: O1 + gap + O1 + gap + P1 + gap + S1  --> 6 intermediate objects
        // UC3: String.join("  ", O1, O1, P1, S1)    --> 1 final object only
        // -------------------------------------------------------
        System.out.println(String.join("  ", O1, O1, P1, S1));
        System.out.println(String.join("  ", O2, O2, P2, S2));
        System.out.println(String.join("  ", O3, O3, P3, S3));
        System.out.println(String.join("  ", O4, O4, P4, S4));
        System.out.println(String.join("  ", O5, O5, P5, S5));
        System.out.println(String.join("  ", O6, O6, P6, S6));
        System.out.println(String.join("  ", O7, O7, P7, S7));
    }
}
