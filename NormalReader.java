package com.pesit.news;
import java.util.ArrayList;


public class NormalReader implements Reader{
	static ArrayList<String> ar =new ArrayList<>(); 
	@Override
	public void display(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.size();i=i+3)
		{
			if(name.equalsIgnoreCase(ar.get(i)))
			{
				int j=i;
				System.out.println(ar.get(++j)+"\n"+ar.get(++j));
			}
		}
		
	}

	@Override
	public void add(String name, String[] s) {
		// TODO Auto-generated method stub
		ar.add(name);
		for(int i=0;i<2;i++)
		{
			ar.add(s[i]);
		}	
	}

}