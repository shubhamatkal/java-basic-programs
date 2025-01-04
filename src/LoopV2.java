public class LoopV2 {
    public static void main(String[] args) {
       
        int[] intArray = {10, 20, 30, 40, 50};

        System.out.print("Elements of intArray using for loop: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        
        System.out.print("Elements of intArray using for-each loop: ");
        for (int element : intArray) {
            System.out.print(element + " ");
        }
    }
}
