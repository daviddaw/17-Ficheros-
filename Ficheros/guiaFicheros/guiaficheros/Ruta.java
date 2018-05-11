package guiaficheros;

import java.util.Scanner;

public class Ruta {

public void clases(Scanner in) {
	int opcion;
	do {
		do {
			System.out.println("Elige una opción:" + "\n	1. File." + "\n	2. Path." + "\n	3. Files." + "\n	4. Paths."+"\n	5. Atras.");
			opcion = in.nextInt();
		} while (opcion < 1 || opcion > 5);

		switch (opcion) {
		case 1:
			System.out.println("File");
				claseFile();
			break;
		case 2:
			System.out.println("Path");
			interfazPath();
			break;
		case 3:
			System.out.println("Files");
			break;
		case 4:
			System.out.println("Paths");
			clasePaths();
			break;

		default:
			break;
		}

	} while (opcion != 5);//

}

private void interfazPath() {
	// TODO Auto-generated method stub
	
}

private void clasePaths() {
	// TODO Auto-generated method stub
	
}

private void claseFile() {
	System.out.println("constructores");
	System.out.println("Metodos");
	
}



}
