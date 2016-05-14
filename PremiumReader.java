package com.pesit.news;
import java.util.ArrayList;

public class PremiumReader implements Reader{

	static ArrayList<String> ar =new ArrayList<>(); 


	@Override
	public void add(String name, String[] s) {
		// TODO Auto-generated method stub
		ar.add(name);
		for(int i=0;i<5;i++)
		{
			ar.add(s[i]);
		}	
		
	}
	@Override
	public void display(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.size();i=i+6)
		{
			if(name.equalsIgnoreCase(ar.get(i)))
			{
				int j=i;
				for(int k=0;k<5;k++)
				System.out.println(ar.get(++j)+"\n");
			}
		}
	}
	
}