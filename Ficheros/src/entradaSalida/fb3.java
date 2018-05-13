package entradaSalida;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class fb3 {
	private static void propiedades(String string) {
		Scanner in = new Scanner(System.in);//ok
		System.out.println("Escribe un fichero(archivo) o un  directorio(carpeta) ");
		string=in.next();
		File file = new File(string);
		long fecha;
		try {
			

		if (!(file.exists())) {
			//ExcepcionficheroNoExiste e= new ExcepcionficheroNoExiste("Excepcion Fichero No Existe");
			//throw e;
			System.out.println("No existe");
		}else {
			 Date date = new Date(file.lastModified());

			if (file.isFile()) {
          
          
				System.out.println("Datos del fichero"+
						"\n Nombre del fichero: "+file.getName()+
						"\n Ruta relativa: "+file.getPath()+
						"\n Ruta absoluta: "+file.getAbsolutePath()+
						"\n ¿Se puede leer? "+file.canRead()+
						"\n ¿Se puede escribir? "+file.canWrite()+
						"\n Tamaño: "+file.length()+
						"\n Ultima modificación: "+date);

			}
			if (file.isDirectory()) {
				System.out.println("Datos del directorio"+
						"\n Nombre del directorio: "+file.getName()+
						"\n Ruta relativa: "+file.getPath()+
						"\n Ruta absoluta: "+file.getAbsolutePath()+
						"\n ¿Se puede leer? "+file.canRead()+
						"\n ¿Se puede escribir? "+file.canWrite()+
						"\n Tamaño: "+file.length()+
						"\n Ultima modificación: "+date);


}
		}
		} catch (Exception e) {
			System.out.println(e);
		}
	//	return file;
		
	}
}
