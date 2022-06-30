


package sop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Hereda de la clase Remote, lo cual la convierte en interfaz remota
public interface GestorUsuariosInt extends Remote
{
    //cabecera del primer método remoto
    public boolean registrarUsuario(int identificacion, String nombres, String apellidos) throws RemoteException;
    //cada definición del método debe especificar que puede lanzar la excepción java.rmi.RemoteException
    
    //cabecera del segundo método remoto
    public int consultarCantidadUsuarios() throws RemoteException; 
    //cada definición del método debe especificar que puede lanzar la excepción java.rmi.RemoteException
}

