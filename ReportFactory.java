package com.pesit.news;

public class ReportFactory extends AbstractFactory{


	@Override
	Reporter getReporter(String Reporter) {
		// TODO Auto-generated method stub
		   if(Reporter == null){
		         return null;
		      }		
		      
		      if(Reporter.equalsIgnoreCase("Sports")){
		         return new Sports();
		         
		      }else if(Reporter.equalsIgnoreCase("Politics")){
		         return new Politics();
		         
		      }else if(Reporter.equalsIgnoreCase("Terror")){
		         return new Terror();
		      }
		      else if(Reporter.equalsIgnoreCase("Movies")){
			         return new Movies();
			      }
		      else if(Reporter.equalsIgnoreCase("Serials")){
			         return new Serials();
			      }
		return null;
	}
	   
	  
	}