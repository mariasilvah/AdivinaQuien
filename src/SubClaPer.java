import java.util.Random;
import java.util.Stack;

public class SubClaPer extends Persona{
	Random rondo = new Random();
	
	String[] Bn = new String[] {"Erick", "Pauli", "Luisi", "Majos", "Linas", "Frank", "Catal", "Flavi", "Marti", "Jenny"};
	String[] cerebro = new String[] {"Sí Tiene cerebro","No tiene cerebro"}; //Boolean
	String[] pasas = new String[] {"Sí Le gustan las pasas", "No le gustan las pasas"};
	String[] opera = new String[] {"Sí Canta opera","No canta opera"};
	String[] flama = new String[] {"Sí Baila flamenco", "No baila flamenco"};
	
	static Stack<Integer>NombRand=new Stack <Integer>(); 
	static int rondn;
	static int renda;
		
	//ALEATORIO NOMBRES
	private static int Aleno(){//static: Indica que es un método de clase y no de instancia. Esto es que el médoto puede ser llamado sin crear una instancia de la clase. 
		rondn=(int)Math.floor(Math.random()*10);
		while(NombRand.contains(rondn)) { 
			rondn=(int)Math.floor(Math.random()*10);
			
		}
		NombRand.push(rondn);//probar si sirve con un !
		return rondn;
	}
	
	//ALEATORIO ATRIBUTOS
	private static int Aleat() {
		renda=(int)Math.floor(Math.random()*2);
		return renda;
	}
	
	public SubClaPer() {
		super.setNombr(Bn[Aleno()]);
		setCer();
		setPas();
		setOpe();
		setFla();
	}
	
	public String toString() {
		return super.getNombr()+"="+super.getCer()+", "+super.getPas()+","+super.getOpe()+","+super.getFla();
	}
	
	public void setCer() {
		this.Cer=cerebro[Aleat()];
	}
	public void setPas() {
		this.Pas=pasas[Aleat()];
	}
	public void setOpe() {
		this.Ope=opera[Aleat()];
	}
	public void setFla() {
		this.Fla=flama[Aleat()];
	}
		
}
