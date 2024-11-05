package paquete;

import java.util.List;

public class App {
	public static void main(String[] args) {
		Equipo equipo=new Equipo("EQUIPO HEROES");
		
		equipo.agregar(new Personaje("Kronos"));
		equipo.agregar(new Personaje("FilisBuster"));
		
		Equipo subEquipo=new Equipo("EQUIPO DEL EJERCICITO");
		subEquipo.agregar(new Personaje("general"));
		subEquipo.agregar(new Personaje("teniente"));
		subEquipo.agregar(new Personaje("sargento"));
		
		equipo.agregar(subEquipo);
		
		Equipo subSubEquipo=new Equipo("REFUERZO INFANTERIA");
		subSubEquipo.agregar(new Personaje("soldado 1"));
		subSubEquipo.agregar(new Personaje("soldado 2"));
		subSubEquipo.agregar(new Personaje("soldado 3"));
		subSubEquipo.agregar(new Personaje("soldado 4"));
		
		subEquipo.agregar(subSubEquipo);
		
		equipo.agregar(new Personaje("Snake"));
		
		equipo.luchar();
		
		//equipo.remover(subEquipo);
		//equipo.luchar();
		
		///podemos poner una funcion interna que diga, setearAlistaDePersonaje en Equipo
		System.out.println("\n\naca esta la lista de personaje");
		List<Personaje> listaPersonajes;	//obtengo sus referencia , no copias OJO
		listaPersonajes=equipo.obtenerHojas();
		for(Personaje p:listaPersonajes  )
			p.luchar();
	}
}
