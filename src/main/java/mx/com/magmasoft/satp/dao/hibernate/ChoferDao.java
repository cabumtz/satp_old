/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.magmasoft.satp.dao.hibernate;

import java.io.Serializable;
import java.util.List;
import mx.com.magmasoft.satp.model.Chofer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carlos
 */
@Repository
public class ChoferDao extends HibernateDaoSupport implements Serializable
{
	public static final long serialVersionUID = 1L;
	
	@Autowired
	public void init(HibernateTemplate hibernateTemplate)
	{
		setHibernateTemplate(hibernateTemplate);
	}

	@SuppressWarnings("unchecked")
	public List<Chofer> listaChoferes()
	{
		return getHibernateTemplate().find("select c from Chofer c");
	}
}
