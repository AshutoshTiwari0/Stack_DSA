package Stack;
import java.util.ArrayDeque;
import java.util.Stack;
public class collection_framework_stack {
    public static void main(String[] args) {
        //Method 1
        // Stack<Integer> nums = new Stack<>();
        //Method 2 (better) it is faster
        ArrayDeque<Integer> nums=new ArrayDeque<>();
        nums.push(10);
        nums.push(20);
        nums.push(30);
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.isEmpty());
        System.out.println(nums.peek());
    }

}
