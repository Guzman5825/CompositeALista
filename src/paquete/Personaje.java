package paquete;

public class Personaje implements Luchador{
	String nombre;
	
	public Personaje(String nombre) {
		this.nombre=nombre;
	}

	public void luchar() {
		System.out.println("personaje:"+nombre+": a luchar...");
	}
}
