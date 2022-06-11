package com.etab.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.etab.dao.DaoEtablissement;
import com.etab.dao.IDao;
import com.etab.models.Etablissement;

@Path("/etabservice")
public class EtablissementServices {
	
	IDao<Etablissement> dao = new DaoEtablissement();
	
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public HttpResponse getAllEtablissement(){
		HttpResponse reponse = new HttpResponse(dao.getAll());
		return reponse;
	}

}
