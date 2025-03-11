package Stacks_AND_Ques;

import java.util.Stack;

public class stackbasic {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.empty());
        stack.push(10);
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        //System.out.println(stack.pop());/



    }
}
