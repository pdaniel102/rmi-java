
package sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/*
Clase que implementa la interface remota GestorUsuariosInt
*/

public class GestorUsuariosImpl extends UnicastRemoteObject implements GestorUsuariosInt
{  
    private ArrayList<Usuario> misUsuarios;

    public GestorUsuariosImpl() throws RemoteException
    {
        super(); //invoca al constructor de la clase base       
        this.misUsuarios = new ArrayList();
    }

    @Override
    public int consultarCantidadUsuarios() throws RemoteException
    {
        System.out.println("Entrando a Cantidad");
        return misUsuarios.size();
    }

    @Override
    public boolean registrarUsuario(int identificacion, String nombres, String apellidos) throws RemoteException
    {
        System.out.println("Entrando a registrar usuario");
        boolean bandera=false;
        
        if(misUsuarios.size() < 5)
        {
            Usuario nuevo = new Usuario(identificacion,nombres,apellidos);
            bandera=misUsuarios.add(nuevo);
            System.out.println("Usuario registrado: identificación: " + identificacion + ", nombres: " + nombres + ", apellidos. " +apellidos );
        }
        
        return bandera;
    }
       
}
