// MiniMaxSum.java

public class MiniMaxSum {

    public static void miniMaxSum(int[] arr) {

        long total = 0;`
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            total += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {

        // Default HackerRank sample input
        int[] arr = {1, 2, 3, 4, 5};

        miniMaxSum(arr);
    }
}
