package mx.com.magmasoft.satp.model;
// Generated 02-sep-2012 14:15:10 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Estatuslicenciaconducir generated by hbm2java
 */
public class Estatuslicenciaconducir  implements java.io.Serializable {


     private int idEstatusLicenciaConducir;
     private String nombre;
     private Set<Renovacionlicenciaconducir> renovacionlicenciaconducirs = new HashSet<Renovacionlicenciaconducir>(0);

    public Estatuslicenciaconducir() {
    }

	
    public Estatuslicenciaconducir(int idEstatusLicenciaConducir) {
        this.idEstatusLicenciaConducir = idEstatusLicenciaConducir;
    }
    public Estatuslicenciaconducir(int idEstatusLicenciaConducir, String nombre, Set<Renovacionlicenciaconducir> renovacionlicenciaconducirs) {
       this.idEstatusLicenciaConducir = idEstatusLicenciaConducir;
       this.nombre = nombre;
       this.renovacionlicenciaconducirs = renovacionlicenciaconducirs;
    }
   
    public int getIdEstatusLicenciaConducir() {
        return this.idEstatusLicenciaConducir;
    }
    
    public void setIdEstatusLicenciaConducir(int idEstatusLicenciaConducir) {
        this.idEstatusLicenciaConducir = idEstatusLicenciaConducir;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Renovacionlicenciaconducir> getRenovacionlicenciaconducirs() {
        return this.renovacionlicenciaconducirs;
    }
    
    public void setRenovacionlicenciaconducirs(Set<Renovacionlicenciaconducir> renovacionlicenciaconducirs) {
        this.renovacionlicenciaconducirs = renovacionlicenciaconducirs;
    }




}


