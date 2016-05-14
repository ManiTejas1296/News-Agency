package com.pesit.news;
import java.util.*;

public class Sports implements Reporter {
	String text;
	static ArrayList<String> ar =new ArrayList<>(); 
	Scanner sn=new Scanner(System.in);
	@Override
	public void writearticle() {
		// TODO Auto-generated method stub
		System.out.println("Enter News");
		text=sn.nextLine();
		System.out.println("Your Article\t" +text+ "\t updated");
	}
	
	@Override
	public void add(String name) {
		// TODO Auto-generated method stub
		ar.add(name);
	}
	@Override
	public void notifyEveryone() {
		// TODO Auto-generated method stub
		int length=ar.size();
		for(int i=0;i<length;i++)
			System.out.println("Notified "+ar.get(i));
		
	}


	@Override
	public void getnews() {
		// TODO Auto-generated method stub
		System.out.println(text);
	}

}