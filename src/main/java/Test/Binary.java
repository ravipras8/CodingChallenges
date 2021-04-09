package Test;

public class Binary {
        public static void main(String[] args) {
            int[] nums = {1,3,5};
            int target = 2;
            if(target < nums[0]){
                System.out.println(0);
            }
           System.err.println(binarySearch(nums,target,0,nums.length));
        }
        
        public static int binarySearch(int[] nums, int target,int i,int last){
            int result = -1;
            int mid = (i + last)/2;
            if(i<last){
            
            if(nums[mid]== target){
                result = mid;
            } else if(target < nums[mid]){
                result = binarySearch(nums,target,i,mid);
            } else if(target > nums[mid]){
                result = binarySearch(nums,target,mid+1,last);
            }
            
            }
            if(result == -1){
                // result = mid;
                // if(nums.length%2 == 0){
                result=mid; 
               /*  int j=mid;
                for(; j<nums.length-1;j++){
                   if(target < nums[j]){
                       break;
                   }
                }
                result = j+1; */
                // } 
                
            }
            return result;
        }
}