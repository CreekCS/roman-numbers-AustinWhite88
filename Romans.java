//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Austin White

import java.util.*;

public class Romans
{
	private Map<String, Integer> m;
	
	public Romans()
	{
		m = new TreeMap<String, Integer>();
		
		//complete your map				
	}
	
	public int getNumber( String s )
	{
		if(s.equals("I")){
			m.put("I",1);
		}
		if(s.equals("V")){
			m.put("V",5);
		}
		if(s.equals("X")){
			m.put("X",10);
		
		}if(s.equals("L")){
			m.put("L",50);
		}
		if(s.equals("C")){
			m.put("C",100);
		}
		if(s.equals("D")){
			m.put("D",500);
		}
		if(s.equals("M")){
			m.put("M",1000);
		}
		
		return m.get(s);
	}

}
