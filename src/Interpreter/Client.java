package Interpreter;

import java.util.Stack;

public class Client {
	public static void main(String[] args) {

		String tokenString = "7 3 - 2 1 + *";
		Stack<Espressione> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				Espressione rightExpression = stack.pop();
				Espressione leftExpression = stack.pop();
				Espressione operator = ExpressionUtils.getOperator(s, leftExpression,rightExpression);
				int result = operator.interpret();
				stack.push(new Numero(result));
			} else {
				Espressione i = new Numero(Integer.parseInt(s));
				stack.push(i);
			}
		}
		System.out.println("( "+tokenString+" ): "+stack.pop().interpret());

	}
}
