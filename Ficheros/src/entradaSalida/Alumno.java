package entradaSalida;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Alumno {
int codigo;
String nombre;
boolean repetidor;
double nota;







public Alumno(int codigo, String nombre, boolean repetidor, double nota) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.repetidor = repetidor;
	this.nota = nota;
}



public int getCodigo() {
	return codigo;
}
public String getNombre() {
	return nombre;
}
public boolean isRepetidor() {
	return repetidor;
}
public double getNota() {
	return nota;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setRepetidor(boolean repetidor) {
	this.repetidor = repetidor;
}
public void setNota(double nota) {
	this.nota = nota;
}

public void volcarFichero(DataOutputStream fich)throws IOException {
	fich.writeInt(codigo);
	fich.writeUTF(nombre);
	fich.writeBoolean(repetidor);
	fich.writeDouble(nota);
	
}
public void leerFichero(DataInputStream fich)throws IOException {
	codigo=fich.readInt();//fich.writeInt(codigo);
	nombre=fich.readUTF();//fich.writeUTF(nombre);
	repetidor=fich.readBoolean();//fich.writeBoolean(repetidor);
	nota=fich.readDouble();//fich.writeDouble(nota);
	
}



public void mostrarFicha() {
	System.out.println("\n");
	System.out.println("codigo "+codigo);
	System.out.println("nombre "+nombre);
	System.out.println("repetidor "+repetidor);
	System.out.println("nota "+nota);
	
}




}
