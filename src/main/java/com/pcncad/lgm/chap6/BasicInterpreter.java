package com.pcncad.lgm.chap6;

import com.pcncad.lgm.stone.BasicParser;
import com.pcncad.lgm.stone.CodeDialog;
import com.pcncad.lgm.stone.Lexer;
import com.pcncad.lgm.stone.ParseException;
import com.pcncad.lgm.stone.Token;
import com.pcncad.lgm.stone.ast.ASTree;
import com.pcncad.lgm.stone.ast.NullStmnt;

public class BasicInterpreter {

	public static void main(String[] args) throws ParseException {
		run(new BasicParser(), new BasicEnv());
	}
	
	public static void run(BasicParser bp, Environment env) throws ParseException{
		Lexer lexer = new Lexer(new CodeDialog());
		while(lexer.peek(0) != Token.EOF){
			ASTree t = bp.parse(lexer);
			if(!(t instanceof NullStmnt)){
				Object r = ((BasicEvaluator.ASTreeEx)t).eval(env);
				System.out.println("=> "+ r);
			}
		}
	}
	
}
