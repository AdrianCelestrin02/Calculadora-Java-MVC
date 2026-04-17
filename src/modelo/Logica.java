package modelo;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;



public class Logica {
	
	public Logica() {
		
	}
	
	public Double devolverResultado(String expresion) {
	    Expression e = new ExpressionBuilder(expresion).build();
	    return e.evaluate();
	}

}
