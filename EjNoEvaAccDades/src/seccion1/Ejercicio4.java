package seccion1;

import java.io.File;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		File fichero = new File(args[0]);

		System.out.println(fichero.exists() ? "Se halla" : "No se halla");
	}

}
