package com.pcncad.lgm.stone.ast;

import com.pcncad.lgm.stone.Token;

public class NumberLiteral extends ASTLeaf {
    public NumberLiteral(Token t) { super(t); }
    public int value() { return token().getNumber(); }
}
