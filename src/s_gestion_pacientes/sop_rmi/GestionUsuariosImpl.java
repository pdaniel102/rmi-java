package s_gestion_pacientes.sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import cliente.UtilidadesRegistroC;
import s_gestion_pacientes.dto.CredencialDTO;
import s_gestion_pacientes.dto.PersonalDTO;

/**
 * GestionUsuariosImpl
 */
public class GestionUsuariosImpl extends UnicastRemoteObject implements GestionUsuariosInt{

    private ArrayList<PersonalDTO> personal;
    private int contador = 0;
    private GestionUsuariosInt objReferenciaRemota;
    private int siAdmin = 0;

    protected GestionUsuariosImpl() throws RemoteException {
        super();
        personal = new ArrayList<>();
    }

    @Override
    public boolean registrarUsuario(PersonalDTO objUsuario) throws RemoteException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public PersonalDTO consultarCantidadUsuarios() throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean abrirSesion(CredencialDTO objCredencial) throws RemoteException {
        // TODO Auto-generated method stub
        return false;
    }

    public int buscarUsuario(int id){
        return 0;
    }

    public int buscarCredencial(CredencialDTO objCredencial){
        return 0;
    }

    public void cosultarReferenciaRemota(String direccionIpRMIRegistry, int numPuertoRMIRegistry){
        System.out.println("  ");
        System.out.println("Desde consultarReferenciaRemote()...");
        this.objReferenciaRemota = (NotificacionInt) UtilidadesRegistroC.obtenerObjetoRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry);
    }
    
}