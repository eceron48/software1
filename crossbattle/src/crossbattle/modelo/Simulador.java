package crossbattle.modelo;

import java.util.Random;

public class Simulador {
		
	private Ejercito ejercito1;
	private Ejercito ejercito2;
	
	private Random rand=new Random(System.nanoTime());
	
	public Simulador() {
		
		
	}
	
	
	public Ejercito getEjercito1() {
		return ejercito1;
	}



	public void setEjercito1(Ejercito ejercito1) {
		this.ejercito1 = ejercito1;
	}



	public Ejercito getEjercito2() {
		return ejercito2;
	}



	public void setEjercito2(Ejercito ejercito2) {
		this.ejercito2 = ejercito2;
	}



	public void crearEjercito1() {
		ejercito1= new Ejercito();
		
		ejercito1.setCantidad(this.aleatorio());
		ejercito1.setColor("negro");
		ejercito1.setSoldados(ejercito1.crearEjercito(ejercito1.getCantidad()));
		
		
		}
	public void crearEjercito2(){
	
		ejercito2= new Ejercito();
	
		ejercito2.setColor("verde");
		ejercito2.setCantidad(this.aleatorio());
		//System.out.println("cantidad1 "+ejercito2.getCantidad());
		ejercito2.setSoldados(ejercito2.crearEjercito(ejercito2.getCantidad()));
		//System.out.println("cantidad "+ejercito2.getSoldados().size()); 
		
	}
	
	
	public int aleatorio() {
		int numero=5+rand.nextInt(11-5);
		return numero;
	}

}
