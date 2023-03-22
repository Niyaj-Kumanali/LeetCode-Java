package LeetCode;
//https://leetcode.com/problems/implement-queue-using-stacks

import java.util.Stack;

class MyQueue {
    private final Stack<Integer> first;
    private final Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        while(!second.isEmpty()){
            first.push(second.pop());
        }

        first.push(x);

        while(!first.isEmpty()){
            second.push(first.pop());
        }
    }

    public int pop() {
        if (second.isEmpty())
            return -1;
        return second.pop();
    }

    public int peek() {
        if (second.isEmpty())
            return -1;
        return second.peek();
    }

    public boolean empty() {
        return second.isEmpty();
    }
}

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        int par1 = obj.pop();
        int par2 = obj.peek();
        boolean par3 = obj.empty();
        System.out.println(par1);
        System.out.println(par2);
        System.out.println(par3);

    }


}
