/*
 * Autor: Ander Jose Fernandez Vega
 * 
 * Practica: Practica 1 - Expresiones Regulares
 * 
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);  
        System.out.print("Introduce una cadena: ");  
        String regex = in.nextLine();
        in.close();
        
		// 1. Validar el DNI o NIE
		System.out.print("\nEjercicio 1 - DNI\t\t: ");
		String regexpDocID =  "(([X-Z]{1})([-]?)(\\d{7})([-]?)([A-Z,J-N,P-T,V-Z]{1}))|((\\d{8})([-]?)([A-Z,J-N,P-T,V-Z]{1}))";
		System.out.print(Pattern.matches(regexpDocID, regex));
		
		// 2. Definir la expresión regular de un número real con exponente
		System.out.print("\nEjercicio 2 - Número real\t: ");
		String regexpReal = "([+-]?\\d*\\.?\\d+([eE][+-]?\\d+)?)|([+-]?\\d+\\.?\\d*([eE][+-]?\\d+)?)";
		System.out.print(Pattern.matches(regexpReal, regex));
		// tiene que haber +.* || *.+
		
		// 3. Dominio de internet
		System.out.print("\nEjercicio 3 - Dominio\t\t: ");
		String regexpDominio = "([a-zA-Z0-9]+(-?[a-zA-Z0-9]+)*\\.)+[a-zA-Z]{2,}";
		System.out.print(Pattern.matches(regexpDominio, regex));
		
		// 4. Dirección email
		System.out.print("\nEjercicio 4 - Email\t\t: ");
		String regexpEmail = "([\\w]+\\.)*[\\w]+@([\\w]+\\.)+\\w{2,5}";
		System.out.print(Pattern.matches(regexpEmail, regex));
		
		// 5. Expresion de identificador
		System.out.print("\nEjercicio 5 - Identificador\t: ");
		String regexpID = "^([\\D\\_])+\\w*";
		System.out.print(Pattern.matches(regexpID, regex));
	}

}
