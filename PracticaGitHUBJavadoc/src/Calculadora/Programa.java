package Calculadora;

public class Programa {
	
	//TODO: Crear un programa principal que 
	//utilice todas las funciones de la calculadora
	//Incluida las operaciones toString y la potencia
	//que habr�is a�adido.
	//Ejecutadlo.
	
	
	
	
	static Calculadora calc = new Calculadora(3,4);
	
	
	public static void main(String[] args) {
		System.out.println(calc.toString());
		System.out.println("Suma = " + calc.suma());
		System.out.println("Resta = " + calc.resta());
		System.out.println("Multiplicacion = " + calc.potencia());
		System.out.println("Division = " + calc.division());
	}
	
}
