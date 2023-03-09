import java.util.Random;
import java.util.Stack;

public abstract class Persona {
	public String Nombr; //Cambiar a private
	public String Cer;//Cambiar a boolean 
	public String Pas;
	public String Ope;
	public String Fla;
	
	public Persona() { //Const?
		
	}
	//NOMBRES DE PERSONAS
	protected String getNombr() { //get porque lo va a "sacar" de private y se le escribe para recibir
		return Nombr;
	}
	protected void setNombr(String Nombr) { //"ancla" el publico con el private. Como solo un reproductor no editable y con eso se lee
		this.Nombr=Nombr;
	}
	//TIENE CEREBRO
	protected String getCer() { 
		return Cer;
	}
	protected void setCer(String Cer) { 
		this.Cer=Cer;
	}
	// LE GUSTAN LAS PASAS
	protected String getPas() { 
		return Pas;
	}
	protected void setPas(String Pas) { 
		this.Pas=Pas;
	}
	//CANTA OPERA
	protected String getOpe() { 
		return Ope;
	}
	protected void setOpe(String Ope) { 
		this.Ope=Ope;
	}
	//BAILA FLAMENCO
	protected String getFla() { 
		return Fla;
	}
	protected void setFla(String Fla) { 
		this.Fla=Fla;
	}
}
