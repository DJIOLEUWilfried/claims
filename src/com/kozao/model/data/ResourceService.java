package com.kozao.model.data;

import java.util.List;

import java.util.Locale.Category;
import com.kozao.model.objet.Resource;

public interface ResourceService {
	
	
    Resource addRessource(Resource res, Category cat);
	
	Resource updateRessource(Resource res) ;
	
	Resource deleteRessource(int id) ;
	
	Resource findRessourceById(int id);
	
	Resource findRessourceByName(String name);

	List<Resource> findAllRessource() ;
	

}
