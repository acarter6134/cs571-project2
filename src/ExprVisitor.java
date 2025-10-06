package src;

public interface ExprVisitor<R> {
    /*
     * Part 2: Implement the visitor pattern for expressions
     */
    public R visitPlusExpr(PlusExpr e);
    public R visitMinusExpr(MinusExpr e);
    public R visitTimesExpr(TimesExpr e);
    public R visitDivExpr(DivExpr e);
    public R visitFloatExpr(FloatExpr e);
}
