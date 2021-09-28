package seccion1;

import java.io.File;


public class Ejercicio3 {

	public static void main(String[] args) {

		File fichero = new File(args[0]);

		System.out.println("Nombre: " + fichero.getName());

		System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());

		System.out.println("Permiso Lectura: " + fichero.canRead());

		System.out.println("Permiso Escritura: " + fichero.canWrite());

		System.out.println("¿Es un Directorio?: " + fichero.isDirectory());

		System.out.println("¿Es un Fichero?: " + fichero.isFile());
		
		System.out.println("Tamaño: " + fichero.length());
		
		System.out.println("Fecha: " + fichero.lastModified());

		System.out.println("¿Se puede ejecutar?:" + fichero.canExecute());
		System.out.println(" ");
		System.out.println("Existe el directorio?" +fichero.exists());//Comprobación Existencia del directorio

	}

}