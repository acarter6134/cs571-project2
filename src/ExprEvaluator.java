package src;

public class ExprEvaluator implements ExprVisitor<Float> {
    /*
     * Part 2: impelement the visitor pattern for expressions
     */
    public Float visitPlusExpr(PlusExpr e){
	return e.getE1().accept(this) + e.getE2().accept(this);
    }

    public Float visitMinusExpr(MinusExpr e){
	return e.getE1().accept(this) - e.getE2().accept(this);
    }

    public Float visitTimesExpr(TimesExpr e){
	return e.getE1().accept(this) * e.getE2().accept(this);
    }

    public Float visitDivExpr(DivExpr e){
	return e.getE1().accept(this) / e.getE2().accept(this);
    }

    public Float visitFloatExpr(FloatExpr e){
	return e.literal;
    }
}
