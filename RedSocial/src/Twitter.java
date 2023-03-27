
package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Twitter {
	List<Usuario> listU;
	
	
	public boolean elimUsu (String nom) {
		Iterator<Usuario> i = this.listU.iterator();
		while(i.hasNext()) {
			Usuario u = i.next();
			if(u.getNom() == nom) {
				u.elimMen();
				i.remove();
				return true;
			}
		}
		
		return false;
	}
	public boolean addUsu (String nom) {
		if(this.listU.stream().filter(p -> p.getNom() == nom).mapToInt() < 1 )){
			Usuario usu = new Usuario(nom);
			return true;
		}
		throw new IllegalArgumentException("nombre de usuario ya registrado");
		return false;
	}
}
