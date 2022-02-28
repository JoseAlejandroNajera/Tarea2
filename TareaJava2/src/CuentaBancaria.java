public class CuentaBancaria {
	
	public Cliente cliente;
	public String tipo;  
	public int id;
	public double fondos;
	 
	public CuentaBancaria( Cliente C, boolean t, int i, double f){
		this.Cliente = C;
		if(t == true){
			this.tipo = monetario
		}
		else{
			this.tipo = falso;
		}
		this.id = i;
		this.fondos = f;
	}
	
	public String getCliente(){
		return cliente;
	}
	public String getTipo(){
		return tipo;
	}
	public String getID(){
		return id;
	}
	public double getFondos(){
		return fondos;
	}
	
	public void addFondos(float f){
		this.fondos = fondos + f;
	}
	public void subFondos(float f){
		this.fondos = fondos - f;
	}
}