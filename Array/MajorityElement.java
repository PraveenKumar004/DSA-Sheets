import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {

    public static List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        int len = nums.length/3;

        for(int i =0 ;i<nums.length;i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }

        for(int a : m.keySet()){
            if(m.get(a)> len){
                l.add(a);
            }
        }


        return l;

    }
    public static void main (String[] args){
        int[] arr= {3,2,3};
        System.err.println(majorityElement(arr));
    }
}
