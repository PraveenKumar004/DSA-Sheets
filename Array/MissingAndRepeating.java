import java.util.ArrayList;
import java.util.Stack;

public class MissingAndRepeating {
    static ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        
        for(int temp : arr){
            if(s.contains(temp)){
                a.add(temp);
            }
            else{
                s.push(temp);
            }
        }
        for(int i =1; i<= arr.length ;i++){
            if(!s.contains(i)){
                a.add(i);
                break;
            }
        }
        
        return a;
        
    }
    public static void main(String[] args) {
        int[] arr ={6 ,5 ,8 ,7, 1, 4, 1, 3, 2};
        System.out.println(findTwoElement(arr));
    }
}
