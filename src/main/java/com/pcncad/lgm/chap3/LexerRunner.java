package com.pcncad.lgm.chap3;

import com.pcncad.lgm.stone.CodeDialog;
import com.pcncad.lgm.stone.Lexer;
import com.pcncad.lgm.stone.ParseException;
import com.pcncad.lgm.stone.Token;

public class LexerRunner {

	public static void main(String[] args) throws ParseException {

		Lexer l = new Lexer(new CodeDialog());
		for(Token t;(t = l.read()) != Token.EOF;){
			System.out.println("=> "+t.getText());
		}
		
	}
	
}
