package s_gestion_pacientes.dto;

import java.io.Serializable;

/**
 * CredencialDTO
 */
public class CredencialDTO implements Serializable {

    private String usuario;
    private String clave;

    public CredencialDTO(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    

}