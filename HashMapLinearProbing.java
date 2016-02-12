
public class HashMapLinearProbing {

	int m = 100;
	int[] keys = new int[m];
	String[] values = new String[m];
	
	private int hash(Integer key)
	{
		return (key.hashCode() & 0x7fffffff) % m;
	}
	public String get(int key)
	{
		String value = null;
		int hash = hash(key);		
		for(int x = keys[hash]; keys[hash] != 0; hash = (hash + 1) % m)
		{	
			if(x == key)
				value = values[hash];
		}
		return value;
		
	}
	public void put(int key, String value)
	{
		int hash = hash(key);
		for(int x = keys[hash]; keys[hash] != 0; hash = (hash + 1) % m)
		{
			
		}
		keys[hash] = key;
		values[hash] = value;
		//System.out.println(key);
		//System.out.println(value);
		
		
	}
	public static void main(String argsp[])
	{
		HashMapLinearProbing hashMap = new HashMapLinearProbing();
		hashMap.put(1, "Bhasin");
		hashMap.put(2, "Kaur");
		hashMap.put(3, "Priya");
		hashMap.put(4, "Kaur");
		hashMap.put(5, "Singh");
		
		
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.get(3));
		System.out.println(hashMap.get(4));
		System.out.println(hashMap.get(10));
	}
	
}
