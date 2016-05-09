package com.pcncad.lgm.chap5;

import com.pcncad.lgm.stone.BasicParser;
import com.pcncad.lgm.stone.CodeDialog;
import com.pcncad.lgm.stone.Lexer;
import com.pcncad.lgm.stone.ParseException;
import com.pcncad.lgm.stone.Token;
import com.pcncad.lgm.stone.ast.ASTree;

public class ParserRunner {

	
	public static void main(String[] args) throws ParseException {
		Lexer lexer = new Lexer( new CodeDialog());
		BasicParser bp = new BasicParser();
		while(lexer.peek(0) != Token.EOF){
			ASTree ast = bp.parse(lexer);
			System.out.println("=> "+ast);
		}
	}
}
