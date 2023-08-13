import java.util.*;

public class implementation{
    public static void main(String[] args) {
        try{
            
        int[] nums = {3 ,4, 7, 8, 9, 11, 12, 13, 17, 19};
        int target = 93;
        
        int ans = binarySearch(nums, target);

        if(ans == -1)   System.out.println("target not found");
        else    System.out.println("target found");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    private static int binarySearch(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = nums.length-1;

        while(left<right)
        {
            int mid = (left+right)/2;

            if(target == nums[mid])  return 1;
            else if(target > nums[mid]) left=mid;
            else    right = mid;
        }
        return -1;

    }
}