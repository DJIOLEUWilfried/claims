package com.kozao.util;

public class Constante {

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/gestion_reclamation";
	public static final String USER = "root";
	public static final String PASSWORD = "";	
	public static final String JDBC_IS_NULL = "Driver JDBC non trouvé : ";
	public static final String CONNEXION_ERROR = "Erreur de connexion : ";
	
	
	// nom_utilisateur	prenom_utilisateur	email	role	statut_utilisateur	mot_de_passe
	public static final String QUERY_CREATE_USER = "INSERT INTO users (user_name, user_first_name, email, user_role, user_status, password) VALUES (?, ?, ?, ?, ?, ?)";
	public static final String QUERY_UPDATE_USER = "UPDATE SET users user_name=?, user_first_name=?, email=?, user_role=?, password=? WHERE id_user=?";
	public static final String QUERY_DELETE_USER = "DELETE users WHERE id_utilisateur=?";
	public static final String QUERY_STAUT_USER = "UPDATE SET users user_status=? WHERE id_utilisateur=?";

	public static final String QUERY_FIND_USER_BY_ID = "SELECT id_user, user_name, user_first_name, email, user_role, user_status WHERE id_user=?";
	public static final String QUERY_FIND_USER_BY_NAME = "SELECT id_user, user_name, user_first_name, email, user_role, user_status WHERE user_name=?";
	public static final String QUERY_FIND_USER_BY_FIRST_NAME = "SELECT id_user, user_name, user_first_name, email, user_role, user_status WHERE user_first_name=?";
	
	
	public static final String CHAMP_IS_EMPTY = "\n Veuillez remplir tous les champs !!" ;
	public static final String MSG_CREATE_USER = "\n Utilisateur creer avec succes !!" ;
	public static final String MSG_FAILLED_CREATE_USER = "\n Echec de creation de l'utilisateur !!" ;
	public static final String MSG_UPDATE_USER = "\n Utilisateur modifier avec succes !!" ;
	public static final String MSG_FAILLED_UPDATE_USER = "\n Echec de modification de l'utilisateur !!" ;
	
	
	
}
