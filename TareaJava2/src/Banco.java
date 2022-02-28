import java.util.Scanner
public class Banco {
	Cliente clientes[] = new Cliente[100];
	Cuentabancaria cuentas[] = new Cuentabancaria[100];
	
	Cliente c = new Cliente(); 
	Cuentabancaria cb = new Cuentabancaria(); 
	Transferencias t = new Transferencias(); 
	
	public static void main(String[] args) {
		//Menu princial
		//1. Ingresar 
		//2. Crear cliente nuevo
		//3. Salir
		
		//Si 1 - pedir cui, revisar que este exista(while loop que revise los cuis de cada cliente) si existe ingresar si no regresar
		//ver cuentas - while loop que busque dentro de cuentas las que sean de este usario y mostrar
		//crear cuenta nueva - creacion de cuenta
		//hacer transferencias - usar clase transferencias con metodo transferencia
		//salir
		
		//si 2
		//creacion de cliente 
    }
	
	for(int i = 0: i<clientes.length; i++{
		c = clientes[i];
		if(c.getCUI().equals("Cui que se le pide al usario"){
			break
		}
		else{
			continue
		}
		
		if(i == clientes.length){
			System.out.println("no existe cliente");
		}
	}
	
	for(int i = 0: i<cuentas.length; i++{
		cb = cuentas[i];
		if(cb.getCliente() == c){
			System.out.println("ID de cuenta: " + cb.getID() + "Tipo de cuenta: " +cb.getTipo() = "Fondos disponibles:  " + cb.getFondos());
		}
		else{
			continue
		}
	}
	int idbuscado = 0 //sera igual al id ingresado por el usuario
	for(int i = 0: i<cuentas.length; i++{
		cb = cuentas[i];
		if(cb.getID() == idbuscado){
			break
		}
		else{
			continue
		}
		if(i == cuentas.length){
			System.out.println("cuenta no existe");
		}
	}
	Cuentabancaria c1 = cb;
	idbuscado = 0 //sera igual al id ingresado por el usuario
	for(int i = 0: i<cuentas.length; i++{
		cb = cuentas[i];
		if(cb.getID() == idbuscado){
			break
		}
		else{
			continue
		}
		if(i == cuentas.length){
			System.out.println("cuenta no existe");
		}
	}
	Cuentabancaria c2 = cb;
	
	t.transferencia(c1, c2, fondos);
	
	
	clientes.add(new Cliente("123", "Ale", "Najera"));
}