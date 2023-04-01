package Ejercicio1;

public class Empleado {
	private int id;
	private String Nombre; 
	private int Edad; 
	
	public static int contadorID=999;
	

	public Empleado () { 
		contadorID++;
		this.id = contadorID;
		this.Nombre = "Sin Nombre";
		this.Edad=0;
	}
	
	public Empleado (String nombre, int edad) {
		contadorID++;
		this.id = contadorID;
		this.Nombre = nombre;
		this.Edad=edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	} 
	
	
}
