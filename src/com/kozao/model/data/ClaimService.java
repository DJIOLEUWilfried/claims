package com.kozao.model.data;

import java.util.List;

import com.kozao.model.objet.*;

public interface ClaimService {

	Claim addReclamation(Claim claim, User user, Category cat);

	Claim updateReclamation(Claim claim, User user, Category cat);

	Claim deleteReclamation(int id);

	Claim findReclamation(Claim recl);

	List<Claim> findAllReclamation();

}
