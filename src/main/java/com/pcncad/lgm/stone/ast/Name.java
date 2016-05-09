package com.pcncad.lgm.stone.ast;

import com.pcncad.lgm.stone.Token;

public class Name extends ASTLeaf {
    public Name(Token t) { super(t); }
    public String name() { return token().getText(); }
}
