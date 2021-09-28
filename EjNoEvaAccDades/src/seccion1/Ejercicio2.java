package seccion1;

import java.io.File;

public class Ejercicio2 {

	public static void main(String[] args) {

		File fichero = new File(args[0]);
//Mostrando características de interes con FILE
		System.out.println("Nombre: " + fichero.getName());

		System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());

		System.out.println("Permiso Lectura: " + fichero.canRead());

		System.out.println("Permiso Escritura: " + fichero.canWrite());

		System.out.println("¿Es un Directorio?: " + fichero.isDirectory());

		System.out.println("¿Es un Fichero?: " + fichero.isFile());

		System.out.println("¿Se puede ejecutar?:" + fichero.canExecute());
		

	}

}