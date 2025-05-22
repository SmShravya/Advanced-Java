/**
 * 3a. Develop a java program for performing various string operations with different string
 * handling functions directed as follows:
 * String Creation and Basic Operations,
 * Length and Character Access,
 * String Comparison,
 * String Searching,
 * Substring Operations,
 * String Modification,
 * Whitespace Handling,
 * String Concatenation,
 * String Splitting,
 * StringBuilder Demo,
 * String Formatting,
 * Validate Email with contains(), startsWith() and endsWith()
 */

package StringOperations;

public class StringOperations {

    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str2: " + str2.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3? " + str1.equals(str3)); // false (case sensitive)
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3)); // true
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // lexicographic comparison

        // 4. String Searching
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Index of 'fox': " + sentence.indexOf("fox"));
        System.out.println("Index of 'cat': " + sentence.indexOf("cat")); // -1 (not found)
        System.out.println("Does sentence contain 'brown'? " + sentence.contains("brown"));

        // 5. Substring Operations
        System.out.println("Substring from index 4: " + sentence.substring(4));
        System.out.println("Substring from 4 to 9: " + sentence.substring(4, 9));

        // 6. String Modification
        System.out.println("Replace 'dog' with 'cat': " + sentence.replace("dog", "cat"));
        System.out.println("Uppercase sentence: " + sentence.toUpperCase());
        System.out.println("Lowercase sentence: " + sentence.toLowerCase());

        // 7. Whitespace Handling
        String stringWithSpaces = "   Hello World!   ";
        System.out.println("Original string with spaces: '" + stringWithSpaces + "'");
        System.out.println("Trimmed string: '" + stringWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concatStr = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatStr);
        concatStr = str1.concat(" ").concat(str2);
        System.out.println("Concatenated using concat(): " + concatStr);

        // 9. String Splitting
        String csv = "apple,banana,cherry,date";
        String[] fruits = csv.split(",");
        System.out.println("Splitting CSV:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" - middle");
        sb.insert(0, "Begin - ");
        sb.replace(6, 12, " changed ");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        int age = 25;
        String formattedString = String.format("My name is %s and I am %d years old.", str1, age);
        System.out.println(formattedString);

        // 12. Validate Email with contains(), startsWith() and endsWith()
        String email = "example.user@gmail.com";
        boolean isValid = email.contains("@") && email.startsWith("example") && email.endsWith(".com");
        System.out.println("Email '" + email + "' is valid? " + isValid);

        String badEmail = "user#gmail.com";
        boolean isBadValid = badEmail.contains("@") && badEmail.startsWith("example") && badEmail.endsWith(".com");
        System.out.println("Email '" + badEmail + "' is valid? " + isBadValid);
    }
}
