package modelo.dto;
// Generated 13-09-2021 17:55:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private TipoUsuario tipoUsuario;
     private String usuario;
     private String contrasenia;
     private Set perfilJugadors = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(TipoUsuario tipoUsuario, String usuario, String contrasenia) {
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    public Usuario(TipoUsuario tipoUsuario, String usuario, String contrasenia, Set perfilJugadors) {
       this.tipoUsuario = tipoUsuario;
       this.usuario = usuario;
       this.contrasenia = contrasenia;
       this.perfilJugadors = perfilJugadors;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public TipoUsuario getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Set getPerfilJugadors() {
        return this.perfilJugadors;
    }
    
    public void setPerfilJugadors(Set perfilJugadors) {
        this.perfilJugadors = perfilJugadors;
    }




}


