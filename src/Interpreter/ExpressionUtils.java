package Interpreter;

public class ExpressionUtils 
{
	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*"))
			return true;
		else
			return false;
	}
	
	public static Espressione getOperator(String s, Espressione left,Espressione right) {
		switch (s) {
		case "+":
			return new Add(left, right);
		case "-":
			return new Substract(left, right);
		case "*":
			return new Product(left, right);
		}
		return null;
	}
}
