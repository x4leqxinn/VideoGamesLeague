package modelo.dto;
// Generated 15-09-2021 23:35:47 by Hibernate Tools 4.3.1

/**
 * DetalleEquipo generated by hbm2java
 */

// FALTA VALIDAR

public class DetalleEquipo implements java.io.Serializable {
    
    private Integer id;
    private Equipo equipo;
    private Incripcion incripcion;
    
    public DetalleEquipo() {
    }
    
    public DetalleEquipo(Integer id) {
        setId(id);
    }
    
    public DetalleEquipo(Integer id, Equipo equipo, Incripcion incripcion) {
        setId(id);
        setEquipo(equipo);
        setIncripcion(incripcion);
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

    public Incripcion getIncripcion() {
        return this.incripcion;
    }
    
    public void setIncripcion(Incripcion incripcion) {
        this.incripcion = incripcion;
    }
    
}
