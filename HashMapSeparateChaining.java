
public class HashMapSeparateChaining {

	Node[] hashArray = new Node[10];
	
	private class Node{
		String key;
		String value;
		Node next;
		Node()
		{

		}
		Node(String key, String value, Node next)
		{
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	private int hash(String key)
	{
		return (key.hashCode() & 0x7fffffff) %10;
		
	}
	public String get(String key)
	{
		String value = null;
		int hash = hash(key);
		for(Node x = hashArray[hash]; x!=null; x=x.next)
		{
			if(x.key.equals(key))
				value = x.value;
		}
		return value;
		
	}
	public void put(String key, String value)
	{
		int hash = hash(key);
		Node old = hashArray[hash];
		hashArray[hash] = new Node(key,value,old);
		
	}
	
	public static void main(String args[])
	{
		HashMapSeparateChaining hashMap = new HashMapSeparateChaining();
		hashMap.put("1", "A");
		hashMap.put("2", "S");
		hashMap.put("3", "B");
		hashMap.put("4", "B");
		hashMap.put("5", "K");
		hashMap.put("6", "R");
		System.out.println(hashMap.get("6"));
		System.out.println(hashMap.get("5"));
		System.out.println(hashMap.get("4"));
		System.out.println(hashMap.get("3"));
		System.out.println(hashMap.get("2"));
		System.out.println(hashMap.get("1"));
	}
	
}
