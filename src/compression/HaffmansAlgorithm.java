package compression;

import java.util.HashMap;

public class HaffmansAlgorithm 
{
	
	
	void getDictionary(String content)
	
	{
			HashMap<Character, Integer> charCountMap= new HashMap<Character, Integer>(); 
			char[] strArray = content.toCharArray(); 
			for (char c : strArray) 
			{ 
				if (charCountMap.containsKey(c)) 
				{ 
					charCountMap.put(c, charCountMap.get(c) + 1); 
				} 
				else 
				{ 
					charCountMap.put(c, 1); 
				} 
			}
			System.out.println(charCountMap);
	}
	      
}	
