package com.kozao.view;

import java.util.Scanner;

import com.kozao.controller.UserController;
import com.kozao.model.access.ConnexionDB;
import com.kozao.model.data.UserServiceImpl;
import com.kozao.model.objet.User;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        String nom, prenom, email, role, passWord;
		
		User user = new User();
		UserController userController = new UserController();
        

		System.out.println(" Entrer le nom : ");
		nom = sc.nextLine();

		System.out.println("\n Entrer le prenom : ");
		prenom = sc.nextLine();

		System.out.println("\n Entrer l'email : ");
		email = sc.nextLine();

		System.out.println("\n Entrer le role : ");
		role = sc.nextLine();

		System.out.println("\n Entrer le mot de passe : ");
		passWord = sc.nextLine();

		userController.addUser(nom, prenom, email, role, passWord);
		System.out.println(UserServiceImpl.msg);

	}

}
