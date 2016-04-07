
public class GroupShiftedStrings {
	
	
	public static String convert(String word)
    {
        //a, ab, abc, abcd
        if(word.length() < 3)
            return word;
            
        StringBuilder result = new StringBuilder();
        result.append(word.charAt(0));
        
        int count = 0;
        for(int i = 1; i < word.length() - 1; i++)
            count +=1;
        
        result.append(count);
        result.append(word.charAt(word.length() - 1));
        
        return result.toString();
    }
	
	public static void main(String args[])
	{
		
		System.out.println(GroupShiftedStrings.convert("asdc"));
		
	}

}
