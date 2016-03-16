import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Node{
	int item;
	Node right;
	Node left;
	
	Node(int item){
		this.item = item;
	}
}
public class BinarySearchTree {

	Node root = null;
	int sum = 0;
	
	public void inOrder(Node root){
		
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(root.item + " ");
			inOrder(root.right);
			
		}
		
	}
	public int sum(Node current)
	{
		
		if(current != null)
		{
			sum(current.left);
			sum = sum + current.item;
			sum(current.right);
		}
		return sum;
		
		
	}
	public void preOrder(Node root){
		
		if(root != null)
		{
			System.out.print(root.item + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void postOrder(Node root){
	
		if(root != null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.item + " ");
		}
	}
	
	
	public void insert(int item){

		if(root == null){		
			
			root = new Node(item);

		}
		else{
			
			Node newNode = new Node(item);
			Node current = root;
			Node parent = null;
			
			
			while(true)
			{
				parent = current;
				
				if(current.item > item)
				{
					current = current.left;
	
					if(current == null)
					{
						parent.left = newNode;
						return;
					}
				}
				else
				{
					current = current.right;
				
					if(current == null)
					{
						parent.right = newNode;
						return;
					}
				}
			}
		}
		
		
	}
	int size(Node node){
		  if(node == null)
		    return 0;
		  else
		  return 1 + size(node.left)
		           + size(node.right);
		}
	//public int sumOfKElements(int k)
	{
		
		
	}
	
	
	public static void main(String args[])
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(15);
		tree.insert(10);
		tree.insert(12);
		tree.insert(20);
		tree.insert(1);
		tree.insert(17);
		tree.insert(2);
		
		tree.inOrder(tree.root);
		System.out.println(" ");
		
		tree.preOrder(tree.root);
		System.out.println(" ");
		
		tree.postOrder(tree.root);
		System.out.println(" ");
		
		System.out.println(tree.size(tree.root));
		System.out.println(tree.size(tree.root.right.left));
				
	}
}
