public class Array {
    public static void main(String[] args) {
    
        // int[] intArray = {10, 20, 30, 40, 50};
        int[] intArray = {10, 20, 30, 40, 50};
        //  int a[]  = new int[5];
        
        // Print the elements of the array
        System.out.print("Elements of intArray: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // Find the length of the array
        int length = intArray.length;
        System.out.println("Length of intArray: " + length);

        // Accessing elements of the array
        int firstElement = intArray[0];
        int lastElement = intArray[intArray.length - 1];
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Modify an element of the array
        intArray[2] = 35;
        System.out.print("Elements of intArray after modification: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // Sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("Sum of all elements in intArray: " + sum);

        // Declare and initialize an array of strings
        String[] strArray = {"Java", "is", "fun"};

        // Print the elements of the string array
        System.out.print("Elements of strArray: ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
        System.out.println();

    }
}
