package com.pesit.news;

public class ReaderFactory {
	public Reader getReader(String string) {

	if(string == null){
		return null;
	}		
	if(string.equalsIgnoreCase("Normal")){
		return new NormalReader();
    
	} 
	else if(string.equalsIgnoreCase("Premium")){
		return new PremiumReader();
    
	} 
	return null;
}}