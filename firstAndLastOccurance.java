public class firstAndLastOccurance {

    public static void main(String[] args) {
      
        int[] nums = {3,4,13,13,20,40};
        int target = 13;

        int first = firstOccurnace(nums,target);
        int last = LastOccurance(nums, target);

        System.out.println(first);
        System.out.println(last);
    }

    private static int LastOccurance(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int ans = -1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(target == nums[mid])
            {
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid] > target)     high = mid-1;

            else low = mid+1;
        }
        return ans;

    }

    private static int firstOccurnace(int[] nums, int target) {

        int low = 0, high = nums.length-1;
        int ans = -1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(target == nums[mid])
            {
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid] < target)     low = mid+1;

            else high = mid-1;
        }
        return ans;
    }
    
}
