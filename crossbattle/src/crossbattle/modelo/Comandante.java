package crossbattle.modelo;

import java.util.Random;


public class Comandante extends Soldado {
	private int habilidad;

	public Comandante() {  // me aseguro que un comandante o capitan tenga los atributos indicados por el cliente //
		this.setAtaque(40);
		this.setVida(140);
		this.habilidad=80;
		
	}
	
	
	
	
	
	public int getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(int habilidad) {
		this.habilidad = habilidad;
	}





	private Random rand= new Random(System.nanoTime());
	
 public int especialAtack() {  // metodo para atacar //
	 if (this.getVida()>0) {
		 int aleatorio=rand.nextInt(3);// genera un numero aleatorio  que determinara si el ataque sera normal o especial//
		 if (aleatorio>0)
		 {
			 this.daño(20);
	
			 return this.habilidad ; 
		 }
		 else {
			 
			 return this.getAtaque();
		 }
		
	 }
	 else {
		 return 0;
		 
	 }
	
	 
 }
 
 

}
