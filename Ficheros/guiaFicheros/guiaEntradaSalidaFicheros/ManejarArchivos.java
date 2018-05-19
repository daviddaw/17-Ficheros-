package guiaEntradaSalidaFicheros;

import java.util.Scanner;

public class ManejarArchivos {
	ArchivosByte archivosByte = new ArchivosByte();
	ArchivosCaracteres archivosCarcteres = new ArchivosCaracteres();
	public void ejemplo(Scanner in) {
	int opcion;
	do {
		do {
			System.out.println("Elige una opción:" + "\n	1. Archivos de byte" + "\n	2. Archivos de carcteres." + "\n	3. Clases que añaden caracteristicas.");
			opcion = in.nextInt();
		} while (opcion < 1 || opcion > 4);

		switch (opcion) {
		case 1:
			System.out.println("Clases FileInputStream y FileOutputStream");
			archivosByte.ejemplos();
		case 2:
			System.out.println("Clases FileReader y FileWriter");
			archivosCarcteres.ejemplos();
			break;
		case 3:
			System.out.println("mas carcteristicas añadidas	");
			masCaracteristicas(in);
			break;

		default:
			break;
		}

	} while (opcion != 4);//

	}

	private void masCaracteristicas(Scanner in) {
	
	int opcion;
	do {
		do {
			System.out.println("Elige una opción:" + "\n	"+
					 "1. (objetos)DataInputStream / DataOutputSream\r\n" + 
					"" + "(agrupando en buffer)	2. BufferedInputStream / BufferedOutputStream\r\n" +
					"3. (agrupando en buffer)BufferedReader / BufferedWriter\r\n" + 
					"4.Conversoreas: InputStreamReader y OutputStreamWriter\r\n" + 
					"\n"+
					"" + "	3. Atras.");
			opcion = in.nextInt();
		} while (opcion < 1 || opcion > 3);

		switch (opcion) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;

		default:
			break;
		}

	} while (opcion != 3);//


		
	}

}


