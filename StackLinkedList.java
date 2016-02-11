
public class StackLinkedList {

	private class Node{
		String item;
		Node next;
	}
	
	Node first = null;
	
	public void push(String item)
	{
		Node old = first;
		first = new Node();
		first.item = item;
		first.next = old;
	}
	public String pop()
	{
		String item = first.item;
		first = first.next;
		return item;
		
	}
	public void print()
	{
		System.out.print("The items in the list are : ");
		for(Node n = first; n!=null; n = n.next)
		{
			System.out.print(n.item + " ");
		}
	}
	public static void main(String args[])
	{
		StackLinkedList stack = new StackLinkedList();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("D");
		stack.push("E");
		stack.push("F");
		stack.print();
	}
}
