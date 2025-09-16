public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 5, 10, 7, 8};
        int target = 5;

        int[] result = slidingWindow(arr, target);

        if (result.length == 0) {
            System.out.println("No subarray found with sum = " + target);
        } else {
            System.out.print("Subarray with sum " + target + ": ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] slidingWindow(int[] arr, int target) {
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // Shrink the window if sum is greater than target
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            // If sum matches, return the subarray
            if (sum == target) {
                int[] result = new int[right - left + 1];
                for (int k = 0; k < result.length; k++) {
                    result[k] = arr[left + k];
                }
                return result;
            }
        }
        return new int[0]; // no subarray found
    }
}
