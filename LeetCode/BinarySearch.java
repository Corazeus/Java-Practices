package LeetCode;

// Create a function that accepts an array and an integer target,
// if this target is found within the array the function should return the position of the target,
// else the function should return -1

public class BinarySearch {

    public static int Search(int[] nums, int target){

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5 ,6, 7, 8 , 9, 10};

        int pos = Search(nums, 10);

        if(pos > 0){
            System.out.println("Target is found on position "+pos);
        }else{
            System.out.println("Target not found");
        }
        
    }
}
