package cliente;

import java.rmi.RemoteException;
import sop_rmi.GestorUsuariosInt;

public class ClienteDeObjetos
{

	private static GestorUsuariosInt objRemoto;
        
	public static void main(String[] args)
	{
            int numPuertoRMIRegistry = 0;
            String direccionIpRMIRegistry = "";        
               
            System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
            direccionIpRMIRegistry = cliente.UtilidadesConsola.leerCadena();
            System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
            numPuertoRMIRegistry = cliente.UtilidadesConsola.leerEntero(); 
            
            objRemoto = (GestorUsuariosInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,numPuertoRMIRegistry, "ObjetoRemotoUsuarios");
            MenuPrincipal();
		
	}
	
	
	private static void MenuPrincipal()
	{
		int opcion = 0;
		do
		{
			System.out.println("==Menu==");
			System.out.println("1. Registrar Usuario");			
			System.out.println("2. Consultar Cantidad de Usuarios");
			System.out.println("3. Salir");
			
			opcion = UtilidadesConsola.leerEntero();
			
			switch(opcion)
			{
				case 1:
					Opcion1();
					break;
				case 2:
					Opcion2();
					break;				
				case 3:
					System.out.println("Salir...");
					break;
				default:
					System.out.println("Opción incorrecta");
			}
			
		}while(opcion != 5);
	}

	private static void Opcion1() 
	{
		try
		{
			System.out.println("==Registro del Cliente==");
			System.out.println("Ingrese la identificacion");
			int id = UtilidadesConsola.leerEntero();
			System.out.println("Ingrese el nombre completo ");
			String nombres = UtilidadesConsola.leerCadena();
			System.out.println("Ingrese los apellidos ");
			String apellidos = UtilidadesConsola.leerCadena();
			
			boolean valor = objRemoto.registrarUsuario(id, nombres, apellidos);
			if(valor)
				System.out.println("Registro realizado satisfactoriamente...");
			else
				System.out.println("no se pudo realizar el registro...");
		}
		catch(RemoteException e)
		{
			System.out.println("La operacion no se pudo completar, intente nuevamente...");
		}
	}
	
	
	
	private static void Opcion2()
	{	
		try
		{
			System.out.println("==Numero de usuarios==");
			int tamanio  = objRemoto.consultarCantidadUsuarios();
			System.out.println("El numero de usuarios registrados es de: "+ tamanio);
		}
		catch(RemoteException e)
		{
			System.out.println("La operación no se pudo completar, intente nuevamente...");
                        System.out.println("Excepcion generada: " + e.getMessage());
		}	
	}
}

