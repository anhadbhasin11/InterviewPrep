
public class QueueArray {
	
	int[] queue = new int[2];
	int first = 0, last = 0, n = 0;
	
	public void push(int item)
	{
		if(n == queue.length) resize(queue.length*2);
		queue[first++] = item;
		if(first == queue.length)first = 0;
		n++;
	}
	
	public int pop()
	{
		int item = queue[last++];
		if(last == queue.length)last = 0;
		n--;
		if(n == queue.length/4) resize(queue.length/2);
		return item;
	}
	
	public void resize(int capacity)
	{
		int[] copy = new int[capacity];
		for(int i  = 0; i <= n; i++)
		{
			copy[i] = queue[(last + i)%queue.length];
		}
		queue = copy;
		first = n;
		last = 0;
		
	}
	public static void main(String argsp[])
	{
		QueueArray queue = new QueueArray();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		queue.push(50);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
	}
}
