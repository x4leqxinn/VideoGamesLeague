package modelo.dto;
// Generated 13-09-2021 19:04:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private TipoUsuario tipoUsuario;
     private String usuario;
     private String contrasenia;
     private Set perfilJugadors = new HashSet(0);

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }
	
    public Usuario(Integer id, TipoUsuario tipoUsuario, String usuario, String contrasenia) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    public Usuario(Integer id, TipoUsuario tipoUsuario, String usuario, String contrasenia, Set perfilJugadors) {
       this.id = id;
       this.tipoUsuario = tipoUsuario;
       this.usuario = usuario;
       this.contrasenia = contrasenia;
       this.perfilJugadors = perfilJugadors;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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


