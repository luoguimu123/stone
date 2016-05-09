package com.pcncad.lgm.stone;

import com.pcncad.lgm.stone.ast.ASTree;

public class StoneException extends RuntimeException {
    public StoneException(String m) { super(m); }
    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }
}
