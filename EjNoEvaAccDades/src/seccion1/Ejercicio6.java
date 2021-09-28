package seccion1;

import java.io.File;

public class Ejercicio6 {

	public static void main(String[] args) {

		File fichero = new File(args[0]);
		String[] ListarArchivos = fichero.list(new FiltroExtension(""));
		if (ListarArchivos == null || ListarArchivos.length == 0) {
			System.out.println("No hay ficheros");

		} else {
			for (int i = 0; i < ListarArchivos.length; i++) {
				System.out.println(ListarArchivos[i]);
				
			}
		}
	}

}
