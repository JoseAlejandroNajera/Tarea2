public class Cliente {
	
	public String cui;
	public String nombre;
	public String apellido;
	 
	public Cliente(String c, String n, String a){
		this.cui = c;
		this.nombre = n;
		this.apellido = a;
		
	}
	
	public String getCUI(){
		return cui;
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
}