package com.pcncad.lgm.stone.ast;

import com.pcncad.lgm.stone.Token;

public class StringLiteral extends ASTLeaf {
    public StringLiteral(Token t) { super(t); }
    public String value() { return token().getText(); }
}
