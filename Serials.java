package com.pesit.news;
import java.util.*;
public class Serials implements Reporter {
	String text;
	Scanner sn=new Scanner(System.in);
	@Override
	public void writearticle() {
		// TODO Auto-generated method stub
		System.out.println("enter news");
		text=sn.nextLine();
		System.out.println("Your Article\t" +text+ "\t updated");
	}
	static ArrayList<String> ar =new ArrayList<>(); 
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