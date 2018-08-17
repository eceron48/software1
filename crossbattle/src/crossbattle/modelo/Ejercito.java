package crossbattle.modelo;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;



public class Ejercito {
	
	private 		String 				color;
	private 		int  	 			cantidad;
	private  		ArrayList <Soldado>	soldados;
	private 		Random  rand=new Random(System.nanoTime());
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public ArrayList<Soldado> getSoldados() {
		return soldados;
	}



	public void setSoldados(ArrayList<Soldado> soldados) {
		this.soldados = soldados;
	}



	public Ejercito() {
		
		
	}
	
	public ArrayList crearEjercito(int cantidad) {
		ArrayList <Soldado>marine;
		marine=new ArrayList<Soldado>();
		
		for(int i=0;i<(cantidad-1);i++) {
			
			int aleatorio=rand.nextInt(3);
			
			switch  (aleatorio) {
			
			case 0:{
					Infanteria s=new Infanteria();
					marine.add(s);
					break;
			}
			case 1:
			{
					Caballeria c=new Caballeria();
					marine.add(c);
					break;
			}
			case 2:
			{

					Tirador c=new Tirador();
					marine.add(c);
					break;
			}
			
			 default:
			{
				JOptionPane.showMessageDialog(null, "error inesperado contacte a un profecional ");
				break;
			}
				
			
			
			}
			
			
			
		}
		Comandante co=new Comandante();
		marine.add(co);
		return marine;
		
	}
	
	
	
}
