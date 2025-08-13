package com.kozao.controller;

import com.kozao.controller.util.Utilitaire;
import com.kozao.model.data.UserService;
import com.kozao.model.data.UserServiceImpl;
import com.kozao.model.objet.User;

public class UserController {
	
	
	UserService userService = new UserServiceImpl();
	User user = new User() ;
	
	public void addUser(String name, String firstName, String email, String role, String password) {
		
		 if (Utilitaire.controlleAddUser(name, firstName, email, role, password)) {
			 
			 UserServiceImpl.msg = "Veuillez remplir tous les champs !!" ;
			 return ;
		 }
		 if(!Utilitaire.emailValid(email)) { UserServiceImpl.msg = "Email invalide !!" ; return ; }
		 
         user.setUserName(name);
         user.setUserFirstName(firstName);
         user.setUserEmail(email);
         user.setUserRole(role);
         user.setPassWord(Utilitaire.cryptPassWord(password));
		
         userService.addUser(user);
	}
	

}
