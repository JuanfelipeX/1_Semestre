
package MetodoPooEjercicios;

	public class DatosCoche1 {
	
	private int ruedas;
	private int largo;  //Encapsular hay dos metodos GETTERS Y SETTERS 
	private int ancho;          
	private int motor;
	private int peso;
	private String color;
	private boolean asientosCuero , Climatizador;
	private int plataforma;
	private int pesototal;
	
	
	public DatosCoche1(){  //Metodo Constructor
		ruedas=4;
		largo=2000;
		ancho=160;
		motor=150;
		peso=6000;
		plataforma= 1500;
		pesototal=0;
	}
	public String DatosGenereales(){       //Devolver el valor de las propiedas del los objetos usar metodo Getter
		return " la plataforma del vehiculo tiene " + ruedas + " ruedas, mide " + largo/1000 + " metros con un ancho de " + ancho +                       " cm y un peso de plataforma de " + peso + " kg ";
	}
	public void EstableceColor(String colorCoche){   // modificar el valor de las propiedades de los objetos Metodo Setter
		color=colorCoche; 
	}
	
	public String DimeColor(){      
		return " El color del coche es " + color;
	}
	
	public void Asientos(String AsientosCueros){   
		if(AsientosCueros.equals("si")){
			asientosCuero=true;
		}else{
			asientosCuero=false;
		}
		}
	

	public String dimeasientos(){       
		if(asientosCuero){
			return " El coche tiene asientos de cuero";
		}else{
			return " El coche tiene asientos  normales";
		}
	}
	
	public void Clima(String Climatizadores){   
		if(Climatizadores.equals("si")){
			Climatizador=true;
		}else{
			Climatizador=false;
		}
		}
	

	public String dimeClima(){       
		if(Climatizador){
			return " El coche tiene Climatizador";
		}else{
			return " El coche no tiene Climatizador";
		}
	}
	public String dimePeso(){   //setter+getter no es recomendado
		int pesocarroceria=500;
		pesototal=plataforma+pesocarroceria;
		if(asientosCuero){
			pesototal=pesototal+50;
		} 
		if(Climatizador){
			pesototal=pesototal+20;
		}
		return "el peso del coche es " + pesototal;
	}
	
	public int preciocoche(){  //getter
		int preciofinal=1000000;
		
		if(asientosCuero){
			preciofinal+=2000;
		}
		if(Climatizador){
			preciofinal+=1000;
		}
		return preciofinal;
	}  
	
}

