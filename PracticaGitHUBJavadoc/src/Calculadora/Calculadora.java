package Calculadora;

public class Calculadora {

	/*
	 * Es un atrubuto de tipo double, operador 1
	 * @param op1 double numero real
	 */
	
	public double op1;
	/*
	 * Es un atributo de tipo double, operador 2
	 * @param op2 double numero real
	 */
	
	public double op2;
	
	/*
	 * Es un constructor que permite generar objetos de la clase calculadora, llama a los metodos
	 * @param op1 double numero real
	 * @param op2 double numero real
	 */
	
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	/*
	 * El atibuto suma recoge el return
	 * @return devuelve el resultado de sumar el op1 + op2
	 */
	
	public double suma() {
		return op1+op2;
	}
	/*
	 * el atributo resta recoge el return
	 * @return devuelve el resultado de restar op1 - op2
	 */
	
	public double resta() {
		return op1-op2;
	}
	/*
	 * el atributo divison recoge el return
	 * @return devuelve el resultado de dividir op1/op2
	 * @throws IllegalArgumentException evita que op2 sea 0
	 */
	
	public double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
		}
		return op1/op2;
	}
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	/*
	 * el atributo potencia recoge el return
	 * @return devuelve el resultado de elevar op1 por op2
	 */
	 public double potencia() {
		return Math.pow(op1, op2);
	}
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
	@Override
	
	public String toString() {
		return "Calculadora de Victor\n"+ "operando1 = "+op1+" operando2 = "+op2;   
	}
	
}
