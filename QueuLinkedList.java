
public class QueuLinkedList {
	
	private class Node{
		String item;
		Node next;
	}
	Node first = null;
	Node last = null;
	
	public void push(String item)
	{
		Node old = last;
		last  = new Node();
		last.item = item;
		if(first == null)
			first = last;
		else
			old.next = last;
	}
	
	public String pop()
	{
		String item = first.item;
		first = first.next;
		if(first == null)
			last = null;
		return item;
	}
	public static void main(String args[])
	{
		QueuLinkedList queue = new QueuLinkedList();
		queue.push("A");
		queue.push("S");
		queue.push("B");
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		queue.push("B");
		queue.push("K");		
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		queue.push("B");
		queue.push("K");		
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}

}
