package s_gestion_pacientes.sop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import s_gestion_pacientes.dto.CredencialDTO;
import s_gestion_pacientes.dto.PersonalDTO;

public interface GestionUsuariosInt extends Remote
{
    public boolean registrarUsuario(PersonalDTO objUsuario) throws RemoteException;
    
    public PersonalDTO consultarCantidadUsuarios() throws RemoteException; 
    
    public boolean abrirSesion(CredencialDTO objCredencial) throws RemoteException;
}

