/*
 * The following code needs a lot of TLC. So give it some! 1. Fix all checkstyle errors 2. Determine
 * what it does (it's going to be tough before you finish #1) 3. Improve the name of the methods and
 * variables 4. Add comments and Javadoc comments where needed 5. Remove unnecessary comments as
 * appropriate
 */

/**
 * Fix errors for this code in order to make it clean.
 */
public class ReclamationProject {
    /**
     * Finds the longest common substring for the entered string values.
     * @param string1 is a String value.
     * @param string2 is a String value.
     * @return a String.
     */
    public static String findLongestCommonSubstring(final String string1, final String string2) {
        String a = string1;
        String b = string2;

        if (a.length() > b.length()) {
            String c = a;
            a = b;
            b = c;
        }
        String r = "";

        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                   if (a.regionMatches(i, b, k, j) && j > r.length()) {
                       r =  a.substring(i, i + j);
                   }
                }
            }
        }
        return r;
    }
}
