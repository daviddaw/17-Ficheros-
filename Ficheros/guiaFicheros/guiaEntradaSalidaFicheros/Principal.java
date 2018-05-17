package guiaEntradaSalidaFicheros;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//objeto
		
		ArchivosYDirectorios archivosYDirectorios = new ArchivosYDirectorios();
		Scanner in = new Scanner(System.in);
		int opcion;
		
			/*
Creación
Apertura (determinado por el tipo de operación que se desee realizar: lectura o escritura)
Lectura (read)
Escritura (write)
Se sobreescribe el contenido anterior del archivo destruyendo su contenido previo
Escritura no destructiva (append)
Se añade nuevo contenido a un archivo existente
Cierre
Borrado 
*/
		do {
			do {
				System.out.println(
						"Elige una opción:" + "\n	1. Archivos y directorios." + "\n	2. Clases Para manejar archivos" + "\n	3. ." + "\n	4. ." + "\n	5. ." + "\n	6. .");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1:
				//	objeto.metodo(in);
				archivosYDirectorios.ejemplos(in);

				break;
			case 2:
				//objeto.metodo(in);
				
				break;
			case 3:
				//objeto.metodo(in);;
				break;
			case 4:
				//Metodos
				break;
			case 5:
				//Metodos
				break;

			}
		} while (opcion != 6);

		in.close();
	}

}