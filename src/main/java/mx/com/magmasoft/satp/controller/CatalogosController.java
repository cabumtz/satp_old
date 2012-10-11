/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.magmasoft.satp.controller;

import java.io.Serializable;
import java.util.List;
import mx.com.magmasoft.satp.model.Pais;
import mx.com.magmasoft.satp.service.PaisService;

/**
 *
 * @author Carlos
 */
public class CatalogosController implements Serializable
{
	public static final long serialVersionUID = 1L;
	
	private PaisService paisService;

	public PaisService getPaisService()
	{
		return paisService;
	}

	public void setPaisService(PaisService paisService)
	{
		this.paisService = paisService;
	}
	
	public List<Pais> listaPaises()
	{
		return paisService.listaPaises();
	}	
}
