public class BinarySearch {
    public static int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target)
                return pivot;
            else if (nums[pivot] < target)
                left = pivot + 1;
            else
                right = pivot - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[]nums = {-1,0,3,5,9,12};
        int target = 9;
        int index = search(nums,target);
        System.out.println(index);
    }
}

