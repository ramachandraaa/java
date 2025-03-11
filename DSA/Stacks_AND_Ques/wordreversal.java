package Stacks_AND_Ques;

import java.util.Stack;

public class wordreversal {
    public static void main(String[] args) {
        String str="Ramac";
        Stack <Character>stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
          stack.push(str.charAt(i));
        }
     for(int i=0;i<str.length();i++)
     {
         System.out.print(stack.pop());
     }

    }
}
