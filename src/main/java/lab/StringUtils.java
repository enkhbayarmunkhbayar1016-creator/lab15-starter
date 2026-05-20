package lab;

public class StringUtils {

    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }
}
