import java.util.Queue;
import java.util.Stack;

public class StackArray {

	int[] stack = new int[1];
	int n = 0;
	
	public void push(int item)
	{
		if(n == stack.length) resize(stack.length * 2);
		stack[n++] = item;
	}
	
	public int pop()
	{
		if( n == 0)return -1;
		int item = stack[--n];
		if(n > 0 && n == stack.length/4) resize(stack.length/2);
		return item;
	}
	
	public void resize(int capacity)
	{
		int[] copy = new int[capacity];
		for(int i = 0; i < n; ++i)
		{
			copy[i] = stack[i];
		}
		stack = copy;
	}
	public void print()
	{
		for(int i = 0; i < stack.length; i++)
		{
			System.out.print(stack[i] + " ");
		}
	}
	public static void main(String args[])
	{
		StackArray stack = new StackArray();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		int it = 10;
		System.out.println(it);
		
	}
}
