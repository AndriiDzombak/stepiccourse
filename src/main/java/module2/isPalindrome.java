package module2;

public class isPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam, I'm Adam!"));

    }

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {

        String formattedText = text.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder builder = new StringBuilder(formattedText);
        StringBuilder reverseStr = builder.reverse();

        System.out.println(reverseStr.toString());
        System.out.println(formattedText);
        return formattedText.equalsIgnoreCase(reverseStr.toString());
    }
}