package bibliaficheros;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//objeto
		Ruta ruta = new Ruta();
		Scanner in = new Scanner(System.in);
		int opcion;

		do {
			do {
				System.out.println(
						"Elige una opción:" + "\n	1. Rutas." + "\n	2. Clases FileInputStream y FileOutputStream." + "\n	3. ." + "\n	4. ." + "\n	5. ." + "\n	6. .");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1:
				//	objeto.metodo(in);
				ruta.clases(in);

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