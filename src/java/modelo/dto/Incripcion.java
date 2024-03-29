package modelo.dto;
// Generated 26-09-2021 5:28:29 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Incripcion generated by hbm2java
 */
// Falta validar 
public class Incripcion implements java.io.Serializable {
    
    private Integer id;
    private Equipo equipo;
    private EstadoSolicitud estadoSolicitud;
    private PerfilJugador perfilJugador;
    private Date fecha;
    private Set detalleEquipos = new HashSet(0);
    
    public Incripcion() {
    }
    
    public Incripcion(Integer id) {
        setId(id);
    }
    
    public Incripcion(Integer id, Equipo equipo, EstadoSolicitud estadoSolicitud, PerfilJugador perfilJugador, Date fecha) {
        setId(id);
        setEquipo(equipo);
        setEstadoSolicitud(estadoSolicitud);
        setPerfilJugador(perfilJugador);
        setFecha(fecha);
    }
    
    public Incripcion(Equipo equipo, EstadoSolicitud estadoSolicitud, PerfilJugador perfilJugador) {
        setEquipo(equipo);
        setEstadoSolicitud(estadoSolicitud);
        setPerfilJugador(perfilJugador);
    }
    
    public Incripcion(Equipo equipo, EstadoSolicitud estadoSolicitud, PerfilJugador perfilJugador, Set detalleEquipos) {
        setEquipo(equipo);
        setEstadoSolicitud(estadoSolicitud);
        setPerfilJugador(perfilJugador);
        setDetalleEquipos(detalleEquipos);
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Equipo getEquipo() {
        return this.equipo;
    }
    
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public EstadoSolicitud getEstadoSolicitud() {
        return this.estadoSolicitud;
    }
    
    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    
    public PerfilJugador getPerfilJugador() {
        return this.perfilJugador;
    }
    
    public void setPerfilJugador(PerfilJugador perfilJugador) {
        this.perfilJugador = perfilJugador;
    }
    
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Set getDetalleEquipos() {
        return this.detalleEquipos;
    }
    
    public void setDetalleEquipos(Set detalleEquipos) {
        this.detalleEquipos = detalleEquipos;
    }
    
}
