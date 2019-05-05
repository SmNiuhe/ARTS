package RemoveLinkedListElements;

public class Sum {

    public static int sum(int[] arr) {

        return sum(arr, 0);
    }

    public static int sum(int[] arr, int l) {

        if (l == arr.length)
            return 0;

        return arr[l] + sum(arr, l + 1);
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = sum(nums);
        System.out.println(sum);
    }


}
