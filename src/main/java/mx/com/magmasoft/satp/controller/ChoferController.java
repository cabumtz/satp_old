package mx.com.magmasoft.satp.controller;

import java.io.Serializable;
import java.util.Date;
import mx.com.magmasoft.satp.model.Entidad;
import mx.com.magmasoft.satp.model.Miembrofisico;
import mx.com.magmasoft.satp.model.Personafisica;
import mx.com.magmasoft.satp.service.ChoferService;
import org.apache.log4j.Logger;

public class ChoferController implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(ChoferController.class);
	
	private ChoferService choferService;
	
	private Entidad entidad;
	
	private Personafisica personafisica = new Personafisica(3, null, "Carlos Alberto", "Bañuelos", "Moro", new Date(), null);
	
	private Miembrofisico miembrofisico;
	
	private String datoPrueba = " HOLA A TODOS ";
	
	public String muestraFormularioAlta()
	{
		logger.info("muestraFormularioAlta: " + personafisica);
		
		return "choferAlta";
	}

	public String muestraFormularioAlta2()
	{
		logger.info("muestraFormularioAlta: " + personafisica);
		
		return "chofer/choferAlta";
	}
	
	public String muestraFormularioAlta3()
	{
		logger.info("muestraFormularioAlta: " + personafisica);
		
		return "../index";
	}
	
	public ChoferService getChoferService()
	{
		return choferService;
	}

	public void setChoferService(ChoferService choferService)
	{
		this.choferService = choferService;
	}
	
	public Personafisica getPersonafisica()
	{
		return personafisica;
	}

	public void setPersonafisica(Personafisica personafisica)
	{
		this.personafisica = personafisica;
	}

	

	public Entidad getEntidad()
	{
		return entidad;
	}

	public void setEntidad(Entidad entidad)
	{
		this.entidad = entidad;
	}

	public Miembrofisico getMiembrofisico()
	{
		return miembrofisico;
	}

	public void setMiembrofisico(Miembrofisico miembrofisico)
	{
		this.miembrofisico = miembrofisico;
	}

	public String getDatoPrueba()
	{
		return datoPrueba;
	}

	public void setDatoPrueba(String datoPrueba)
	{
		this.datoPrueba = datoPrueba;
	}
	
	
}
