package Interpreter;

public class Product implements Espressione {

	private final Espressione leftExpression;
	private final Espressione rightExpression;

	public Product(Espressione leftExpression,Espressione rightExpression ){
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	@Override
	public int interpret() {
		return leftExpression.interpret() * rightExpression.interpret();
	}

}
