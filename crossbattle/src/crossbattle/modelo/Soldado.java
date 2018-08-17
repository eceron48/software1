package crossbattle.modelo;

public class Soldado {
	private int vida;
	private int ataque;
	

	public Soldado() {
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	//-------------------metodos-ataque--------------------------------//
	public int ataque() {
		if(this.getVida()>0) {
			return this.getAtaque() ;
		}
		
		else {
				return 0;
			 }

	
	}
	//-------daño recibido--------------------------------------------------//
	
	public int daño(int salud) {
		if(this.vida>salud) {
			return this.vida-=salud;
			
		}else {
			
			return this.vida=0;
		}
	
	}
	
	

}
