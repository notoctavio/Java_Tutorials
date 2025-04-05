package com.in28minutes.primitive.datatypes;

public class MyChar {
	
	private char ch;
	
	public MyChar(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' 
				|| ch == 'u')
		{
			return true;
			
		}
		
		
		return false;
	}

	public boolean isDigit() {
		// TODO Auto-generated method stub
		if( (int)ch >= 48 && (int)ch<=57 ) {
			return true;
		}
		return false;
		
	}

	public boolean isConsonant() {
		// TODO Auto-generated method stub
		if(isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	private boolean isAlphabet() {
		// TODO Auto-generated method stub
		if(ch>=97 && ch<=122) {
		return true;
	}
		
		return false;
	}
	
	
	

}
