package paquete;

import java.util.ArrayList;
import java.util.List;

public class Equipo implements Luchador {

	String nombre;
	List<Luchador> luchadores;
	
	public Equipo(String nombre) {
		this.nombre=nombre;
		this.luchadores = new ArrayList<Luchador>();
	}

	public void agregar(Luchador l){
		luchadores.add(l);
	}
	
	public void remover(Luchador l) {
		luchadores.remove(l);
	}
	
	@Override
	public void luchar() {
		System.out.println(nombre+": equipo a luchar");
		for(Luchador luchador:luchadores)
			luchador.luchar();
	}
	
	///esta funcion devuelve una lista de luchadores
	public List<Personaje> obtenerHojas() {
        List<Personaje> hojas = new ArrayList<>();
        for (Luchador luchador : luchadores) {
            if (luchador instanceof Personaje) {
                hojas.add((Personaje) luchador);
            } else if (luchador instanceof Equipo) {
                hojas.addAll(((Equipo) luchador).obtenerHojas());
            }
        }
        return hojas;
    }

}
