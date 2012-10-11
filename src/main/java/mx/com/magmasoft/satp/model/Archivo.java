package mx.com.magmasoft.satp.model;
// Generated 02-sep-2012 14:15:10 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Archivo generated by hbm2java
 */
public class Archivo  implements java.io.Serializable {


     private Integer idArchivo;
     private Tipomime tipomime;
     private Tipoarchivo tipoarchivo;
     private Entidad entidad;
     private String nombre;
     private String descripcion;
     private byte[] dato;
     private Date fechaCreacion;
     private Date fechaModificacion;

    public Archivo() {
    }

	
    public Archivo(Tipomime tipomime, Tipoarchivo tipoarchivo, Entidad entidad, String nombre, byte[] dato, Date fechaCreacion) {
        this.tipomime = tipomime;
        this.tipoarchivo = tipoarchivo;
        this.entidad = entidad;
        this.nombre = nombre;
        this.dato = dato;
        this.fechaCreacion = fechaCreacion;
    }
    public Archivo(Tipomime tipomime, Tipoarchivo tipoarchivo, Entidad entidad, String nombre, String descripcion, byte[] dato, Date fechaCreacion, Date fechaModificacion) {
       this.tipomime = tipomime;
       this.tipoarchivo = tipoarchivo;
       this.entidad = entidad;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.dato = dato;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
    }
   
    public Integer getIdArchivo() {
        return this.idArchivo;
    }
    
    public void setIdArchivo(Integer idArchivo) {
        this.idArchivo = idArchivo;
    }
    public Tipomime getTipomime() {
        return this.tipomime;
    }
    
    public void setTipomime(Tipomime tipomime) {
        this.tipomime = tipomime;
    }
    public Tipoarchivo getTipoarchivo() {
        return this.tipoarchivo;
    }
    
    public void setTipoarchivo(Tipoarchivo tipoarchivo) {
        this.tipoarchivo = tipoarchivo;
    }
    public Entidad getEntidad() {
        return this.entidad;
    }
    
    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public byte[] getDato() {
        return this.dato;
    }
    
    public void setDato(byte[] dato) {
        this.dato = dato;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }




}

