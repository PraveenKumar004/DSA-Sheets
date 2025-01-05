import java.util.*;
public class ThreeSumProblem
{
    public static List<List<Integer>> threesum (int[] nums){

        Set<List<Integer>> s = new HashSet<>();

        Arrays.sort(nums);

        int n = nums.length -1;
        for(int i =0 ;i <= n ;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = nums[i];
            int l = i+1;
            int r = n;
            while (l<r) {
                int sum = k + nums[l] + nums[r];
                if( sum == 0){
                    List<Integer> arrList = new ArrayList<>();
                    arrList.add(k);
                    arrList.add(nums[l]);
                    arrList.add(nums[r]);
                    s.add(arrList);
                    l++;r--;
                }
                else if(sum > 0){
                    r--;
                }
                else {
                    l++;
                }
                
            }

        }
        List<List<Integer>> ans = new ArrayList<>(s);
        return ans;
    }
	public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
		System.out.println(threesum(arr));

	}
}