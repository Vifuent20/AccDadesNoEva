package seccion1;

import java.io.*;

public class Ejercicio8 {

	public static void main(String[] args) throws IOException {


		String nomFich = args[0];
		System.out.println("Fichero Original: " + nomFich);
		
		int posPunto = nomFich.indexOf(".");
		
		String nomFichSinExtension = nomFich.substring(0, posPunto);
		String extension = nomFich.substring(posPunto);
		String nomFichCopia = nomFichSinExtension + "_copia" + extension;

		System.out.println("Fichero copia: " + nomFichCopia);
		
		File fichOrigin = new File (nomFich);
		File fichCopy = new File(nomFichCopia);
		
		FileReader fr = new FileReader(fichOrigin);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(fichCopy);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String linea = br.readLine();
		
		while (linea != null) {
			System.out.println("Copiando \"" + linea + "\" de " + nomFich + " a " + nomFichCopia);
			bw.write(linea);
			linea = br.readLine();
		}
		br.close();
		bw.close();
		fr.close();
		fw.close();
		
		System.out.println("Borrando Fichero " + nomFichCopia);
		fichCopy.delete();
		









	}
}
