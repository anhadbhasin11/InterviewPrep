
public class MinOfStackInOof1 {
	
	int[] stack = new int[1];
	int n = 0;
	int min = 0;
	
	public void push(int item)
	{
		if(n == stack.length)resize(stack.length * 2);
		stack[n++] = item;
		if(stack[n-1] < stack[min])
			min = n-1;
		
	}
	
	public int pop()
	{
		if (min == n-1)
			setMinimum();
		int item = stack[--n];
		if(n == stack.length/4)resize(stack.length / 2);
		return item;
		
	}
	public void setMinimum()
	{
		int minimum = 0;
		for(int i = 0; i < n-1; i++)
		{
			if(stack[i] < stack[minimum])
				minimum = i;
		}
		min = minimum;
	}
	public int getMinimum()
	{	
		return stack[min];
		
	}
	private void resize(int capacity)
	{
		int copy[] = new int[capacity];
		for(int i =0; i < stack.length; i++)
		{
			copy[i] = stack[i];
		}
		stack = copy;
		
	}
	public static void main(String args[])
	{
		MinOfStackInOof1 stack = new MinOfStackInOof1();
		stack.push(4);
		stack.push(5);
		stack.push(2);
		stack.push(1000);
		stack.push(1);
		stack.push(1000);
		System.out.println(stack.getMinimum());
		stack.pop();
		stack.pop();
		
		System.out.println(stack.getMinimum());
	}
	

}
