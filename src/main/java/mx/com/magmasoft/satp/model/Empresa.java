package mx.com.magmasoft.satp.model;
// Generated 02-sep-2012 14:15:10 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private int idEmpresa;
     private Agrupacionpersonas agrupacionpersonas;
     private Set<Empresaruta> empresarutas = new HashSet<Empresaruta>(0);

    public Empresa() {
    }

	
    public Empresa(int idEmpresa, Agrupacionpersonas agrupacionpersonas) {
        this.idEmpresa = idEmpresa;
        this.agrupacionpersonas = agrupacionpersonas;
    }
    public Empresa(int idEmpresa, Agrupacionpersonas agrupacionpersonas, Set<Empresaruta> empresarutas) {
       this.idEmpresa = idEmpresa;
       this.agrupacionpersonas = agrupacionpersonas;
       this.empresarutas = empresarutas;
    }
   
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Agrupacionpersonas getAgrupacionpersonas() {
        return this.agrupacionpersonas;
    }
    
    public void setAgrupacionpersonas(Agrupacionpersonas agrupacionpersonas) {
        this.agrupacionpersonas = agrupacionpersonas;
    }
    public Set<Empresaruta> getEmpresarutas() {
        return this.empresarutas;
    }
    
    public void setEmpresarutas(Set<Empresaruta> empresarutas) {
        this.empresarutas = empresarutas;
    }




}


