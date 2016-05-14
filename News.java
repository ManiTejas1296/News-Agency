package com.pesit.news;

import java.util.Scanner;


public class News {

		public static void main(String [] args)
		{Scanner in=new Scanner(System.in);
			String[] category={"Sports","Politics","Terror","Movies","Serials"};
			boolean wish=true;
			ReportFactory reportFactory;
			
			Reporter report = null;
			int option;
			String type;
			String name;
			while(wish)
				{String[] s=new String[5];
				ReaderFactory rf;
				Reader r1;
				
				System.out.println("1.Subscribe 2.Reporter 3. reader 4. exit \n Enter the number : ");
				option=in.nextInt();
				switch(option)
				{
				case 1:	
						System.out.println("Enter name: ");
						name=in.next();
						System.out.println("Premium can have 5 categories max \n Normalcan have 2 categories max \n");
						System.out.println("Choose Premium or Normal :");
						type=in.next();
						for(String a: category)
						{
							System.out.println(a);
						}	
						if(type.equalsIgnoreCase("Premium"))
						{
							for(int i=0;i<5;i++)
							{	
								s[i]=in.next();
								reportFactory = new ReportFactory();
								report = reportFactory.getReporter(s[i]);
								report.add(name);
							}	
						}
						else if(type.equalsIgnoreCase("Normal"))
						{
							for(int i=0;i<2;i++)
							{	
								s[i]=in.next();
								reportFactory = new ReportFactory();
								report = reportFactory.getReporter(s[i]);
								report.add(name);
							}	System.out.println("Successfully subscribed");
						}	
						rf=new ReaderFactory();
						r1= rf.getReader(type);
						r1.add(name,s);
						
						break;
				case 2:	
					System.out.println("Your name?");
					name=in.next();
					System.out.println("WHich category article u want to write? ");
					for(String e: category)
					{
						System.out.println(e);
					}	
					type=in.next();
					reportFactory = new ReportFactory();
					report = reportFactory.getReporter(type);
				    report.writearticle();
				    report.notifyEveryone();
					break;
		case 3: 
				System.out.println("Your name?");
				name=in.next();
				System.out.println("type of reader?");
				type=in.next();
				System.out.println("Categories : \n");
				rf=new ReaderFactory();
				r1= rf.getReader(type);
				r1.display(name);
				System.out.println(r1);
				((Reporter) r1).getnews();
				break;
		case 4: break;
		default: break;
		}
	}	
}
}