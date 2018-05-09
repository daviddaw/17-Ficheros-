package entradaSalida;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FicheroBytes {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	String archivo;
	System.out.println("Escribe texto del fichero");
	System.out.println("Escribe el nombre del fichero");
	archivo=in.next();
	File file = new File(archivo);
	try {
		if (file.createNewFile()) {
			System.out.println("File creado correctamente");
			/*try {
				FileOutputStream fos = new FileOutputStream(f);//objeto grabar
				if (f.exists()) {
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}*/
			

			
		}else {
			int opcion;
			do {
				do {
					System.out.println("El fichero ya existe elige una opción:" + "\n	1. Grabar." + "\n	2. Añadir texto." + "\n	3. Atras.");
					opcion = in.nextInt();
				} while (opcion < 1 || opcion > 3);

				switch (opcion) {
				case 1:
					System.out.println("Reescribir");
					FileOutputStream f=null;
					System.out.println("Introduce la cadena de texto a grabar");
					String cad=in.next();
				
					
					break;
				case 2:
					System.out.println("Añadir texto al final del fichero");
					break;

				default:
					break;
				}

			} while (opcion != 3);//
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	in.close();
}

}
