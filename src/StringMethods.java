public class StringMethods {
    public static void main(String[] args) {
        // Create a string
        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        // Convert to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        // Substring from index 7
        String subStr1 = str.substring(7);
        System.out.println("Substring from index 7: " + subStr1);

        // Substring from index 0 to 5 (exclusive)
        String subStr2 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + subStr2);

        // Replace 'World' with 'Java'
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced string: " + replacedStr);

        // Check if the string contains 'World'
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // Check if the string starts with 'Hello'
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Check if the string ends with '!'
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWithExclamation);

        // Trim the string (removing leading and trailing spaces)
        String str1 = "   Hi   ";
        String trimmedStr = str1.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // Split the string by comma
        String[] splitStr = str.split(",");
        System.out.println("Split string by comma: ");
        for (String part : splitStr) {
            System.out.println(part.trim());
        }

        // Find the index of 'World'
        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // Concatenate with another string
        String concatenatedStr = str.concat(" Welcome to Java!");
        System.out.println("Concatenated string: " + concatenatedStr);
    }
}

