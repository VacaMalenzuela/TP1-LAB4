package Ejercicio1;

public class Empleado {
	private int id;
	private String nombre; 
	private int edad; 
	
	public static int proximoId = 1000;
	
	public static int devuelveProximoId() {
		return proximoId;
	}

	public Empleado () { 
		this.id = proximoId;
		this.nombre = "Sin Nombre";
		this.edad = 99;

		proximoId++;
	}
	
	public Empleado (String nombre, int edad) {
		this.id = proximoId;
		this.nombre = nombre;
		this.edad = edad;

		proximoId++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	} 
	
	
}
