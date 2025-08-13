package com.kozao.controller.util;

import org.mindrot.jbcrypt.BCrypt;

public class Utilitaire {

	public static boolean controlleAddUser(String name, String firstName, String email, String role, String password) {

		if (name.isEmpty() || firstName.isEmpty() || email.isEmpty() || role.isEmpty() || password.isEmpty()) {

			return true;
		}

		return false;
	}
	
	public static boolean emailValid(String email) {
		
		if (email.contains("@") && email.contains(".")) {

			return true;
		}

		return false;
	}
	
	public static String cryptPassWord(String passWord) {
		
		return BCrypt.hashpw(passWord, BCrypt.gensalt());
	}

}
