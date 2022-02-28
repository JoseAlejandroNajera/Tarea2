public class Transferencias {
	
	public transferencia (CuentaBancaria c1, CuentaBancaria c2, double f){
		//revisar que los fondos en c1 sean suficientes (if(f<= c1.getFondos()))
		
		c1.subfondos(f);
		c2.addfondos(f);