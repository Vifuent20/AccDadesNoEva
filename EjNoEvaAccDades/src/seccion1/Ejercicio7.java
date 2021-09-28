package seccion1;

import java.io.File;


public class Ejercicio7 {
	 

		public static void main(String[] args) {

			File fichero = new File(args[0]);
			
			int nExtensiones = args.length - 1;
			for (int i = 1; i<= nExtensiones; i++) {
				FiltroExtension filtro = new FiltroExtension(args[i]);
				String[] lista = fichero.list(filtro);
				for (String elemento : lista) {
					System.out.println(elemento);
				}
			}
		}
	}



