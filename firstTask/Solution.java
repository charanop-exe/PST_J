// Solution.java

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // Initialize smallest and largest with the first substring
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Loop through all substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));
    }
}