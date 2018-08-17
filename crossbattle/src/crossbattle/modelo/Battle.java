package crossbattle.modelo;

import java.util.Random;

public class Battle {
	
	private boolean batalla;
	
	private Random rand = new Random(System.nanoTime());
	
	
	public void batalla() {
		Simulador sim=new Simulador();
		sim.crearEjercito1();
		sim.crearEjercito2();
		
		int iniciador =rand.nextInt(2);
		if (iniciador >0) {//  si es mayor inicia el ejercito 1//
				batalla=true;
		
				
				int aleatorio1=this.seleccionSoldado(sim.getEjercito1().getCantidad()); // se selecciona el el primer soldado para la batalla//
				int aleatorio2=this.seleccionSoldado(sim.getEjercito2().getCantidad());//----------------------------------------------------//
				
				while (batalla==true) {  // -----------------------------------------------bucle de batalla//
				
					sim.getEjercito2().getSoldados().get(aleatorio2).daño(sim.getEjercito1().getSoldados().get(aleatorio1).getAtaque()); // gerra por turnos t1//
				
					sim.getEjercito1().getSoldados().get(aleatorio1).daño(sim.getEjercito2().getSoldados().get(aleatorio2).getAtaque());// --t2--- //
				
					if (sim.getEjercito1().getSoldados().size() !=0 ||sim.getEjercito2().getSoldados().size() !=0)//confirma la victoria del ejercito //
					{
						
						if (sim.getEjercito2().getSoldados().get(aleatorio2).getVida()<=0) {					
								sim.getEjercito2().getSoldados().remove(aleatorio2);						//se retira el soldado abatido//
								aleatorio2=	this.seleccionSoldado(sim.getEjercito2().getSoldados().size());//relevo de soldado  ejrcito 2 si este se queda con puntos =0//
					
						}
				
						if (sim.getEjercito1().getSoldados().get(aleatorio1).getVida()<=0) {				
							sim.getEjercito1().getSoldados().remove(aleatorio1);						//retiro oficial del solddo abatido //
							aleatorio1=	this.seleccionSoldado(sim.getEjercito1().getSoldados().size());//relevo de soldado  ejrcito 1 si este se queda con puntos =0//
				
						}
					 }
					else {
						
						 batalla=false;	//final de la batalla//
						}	 
				}
		}
		else {
			batalla=true;
			int aleatorio1=this.seleccionSoldado(sim.getEjercito1().getCantidad());
			int aleatorio2=this.seleccionSoldado(sim.getEjercito2().getCantidad());
			
			while (batalla==true) {
			
				sim.getEjercito1().getSoldados().get(aleatorio1).daño(sim.getEjercito2().getSoldados().get(aleatorio2).getAtaque());
			
				sim.getEjercito2().getSoldados().get(aleatorio2).daño(sim.getEjercito1().getSoldados().get(aleatorio1).getAtaque());
				System.out.println(sim.getEjercito2().getSoldados().size());
				System.out.println(sim.getEjercito1().getSoldados().size());
			
				if (sim.getEjercito2().getSoldados().size() !=0 ||sim.getEjercito1().getSoldados().size() !=0)
				{
					
					if (sim.getEjercito1().getSoldados().get(aleatorio1).getVida()==0) {
						sim.getEjercito1().getSoldados().remove(aleatorio1);
						aleatorio1=	this.seleccionSoldado(sim.getEjercito1().getSoldados().size());
				
					}
			
					if (sim.getEjercito2().getSoldados().get(aleatorio2).getVida()==0) {
						sim.getEjercito2().getSoldados().remove(aleatorio2);
						aleatorio2=	this.seleccionSoldado(sim.getEjercito2().getSoldados().size());
			
					}
				 }
				else {
					
					 batalla=false;	
					}	 
			}
			
				
			
		}
		
		
	}
	
	
	public int  seleccionSoldado(int cantidad) {
		int aleatorio=0;
		aleatorio=rand.nextInt(cantidad);
		return aleatorio;
		
	}

	

}
