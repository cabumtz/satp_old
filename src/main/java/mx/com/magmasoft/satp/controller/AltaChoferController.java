/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.magmasoft.satp.controller;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import mx.com.magmasoft.satp.model.Chofer;
import mx.com.magmasoft.satp.model.Direccion;
import mx.com.magmasoft.satp.model.Entidad;
import mx.com.magmasoft.satp.model.Estado;
import mx.com.magmasoft.satp.model.Miembrofisico;
import mx.com.magmasoft.satp.model.Pais;
import mx.com.magmasoft.satp.model.Personafisica;
import mx.com.magmasoft.satp.service.ChoferService;
import mx.com.magmasoft.satp.service.EstadoService;
import mx.com.magmasoft.satp.service.PaisService;
import org.apache.log4j.Logger;

/**
 *
 * @author Carlos
 */
public class AltaChoferController implements Serializable
{

	public static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(AltaChoferController.class);
	
	private ChoferService choferService;
	private PaisService paisService;
	private EstadoService estadoService;
	
	private Entidad entidad = new Entidad();
	private Personafisica personafisica = new Personafisica();
	private Miembrofisico miembrofisico = new Miembrofisico();
	private Chofer chofer = new Chofer();
	private Pais paisSeleccionado;
	private Integer idPaisSeleccionado;
	private Estado estadoSeleccionado;
	private Direccion direccion = new Direccion();
	private Integer idEstadoSeleccionado;
	private List<Estado> listaEstados;

	public void guardarChofer(ActionEvent actionEvent)
	{
		//choferService.

		FacesMessage msg = new FacesMessage("Successdul", "Nuevo chofer");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Chofer getChofer()
	{
		return chofer;
	}

	public void setChofer(Chofer chofer)
	{
		this.chofer = chofer;
	}

	public ChoferService getChoferService()
	{
		return choferService;
	}

	public void setChoferService(ChoferService choferService)
	{
		this.choferService = choferService;
	}

	public PaisService getPaisService()
	{
		return paisService;
	}

	public void setPaisService(PaisService paisService)
	{
		this.paisService = paisService;
	}

	public EstadoService getEstadoService()
	{
		return estadoService;
	}

	public void setEstadoService(EstadoService estadoService)
	{
		this.estadoService = estadoService;
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

	public Personafisica getPersonafisica()
	{
		return personafisica;
	}

	public void setPersonafisica(Personafisica personafisica)
	{
		this.personafisica = personafisica;
	}

	public Direccion getDireccion()
	{
		return direccion;
	}

	public void setDireccion(Direccion direccion)
	{
		this.direccion = direccion;
	}

	public Pais getPaisSeleccionado()
	{
		return paisSeleccionado;
	}

	public void setPaisSeleccionado(Pais paisSeleccionado)
	{
		this.paisSeleccionado = paisSeleccionado;
	}

	public Integer getIdPaisSeleccionado()
	{
		return idPaisSeleccionado;
	}

	public void setIdPaisSeleccionado(Integer idPaisSeleccionado)
	{
		this.idPaisSeleccionado = idPaisSeleccionado;
	}

	public Estado getEstadoSeleccionado()
	{
		return estadoSeleccionado;
	}

	public void setEstadoSeleccionado(Estado estadoSeleccionado)
	{
		this.estadoSeleccionado = estadoSeleccionado;
	}

	public Integer getIdEstadoSeleccionado()
	{
		return idEstadoSeleccionado;
	}

	public void setIdEstadoSeleccionado(Integer idEstadoSeleccionado)
	{
		this.idEstadoSeleccionado = idEstadoSeleccionado;
	}

	public List<Pais> getListaPaises()
	{
		List<Pais> paises = null;
		StringBuilder sb = new StringBuilder("Paises:\n");

		logger.info("getListaPaises");

		try
		{
			paises = paisService.listaPaises();

			for (Pais p : paises)
			{
				sb.append("\t- p: ");
				sb.append(p);
				sb.append('\n');
			}

			logger.info(sb.toString());

			return paises;
		}
		catch (Exception e)
		{
			logger.error("Error in listaPaises", e);
			return null;
		}
	}

	public void actualizaListaEstados()
	{
		logger.info("idPaisSeleccionado: " + idPaisSeleccionado);
		
		listaEstados = estadoService.listaEstadosPorIdPais(idPaisSeleccionado);
	}

	public List<Estado> getListaEstados()
	{
		return listaEstados;
	}

	public void setListaEstados(List<Estado> listaEstados)
	{
		this.listaEstados = listaEstados;
	}
}
