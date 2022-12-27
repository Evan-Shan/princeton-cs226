package week2;

public class TestSort {

    public static void adhoctestSort(String[] input, String[] expected) {
        selection.sort(input);
        for (int i = 0; i < input.length; i += 1) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position " + i + ", expected: " + expected + ", but got: " + input[i] + ".");
                break;
            }
        }
    }

    public static void junittestSort(String[] input, String[] expected) {
        selection.sort(input);
        // org.junit.Assert.assertArrayEquals(expected, input);
    }
    
    public static void main(String[] args){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        adhoctestSort(input, expected);
        junittestSort(input, expected);
    }
}
