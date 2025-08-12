package com.kozao.util;

public class Constante {

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/gestion_reclamation";
	public static final String USER = "root";
	public static final String PASSWORD = "";	
	public static final String JDBC_IS_NULL = "Driver JDBC non trouvé : ";
	public static final String CONNEXION_ERROR = "Erreur de connexion : ";
	
	
	// nom_utilisateur	prenom_utilisateur	email	role	statut_utilisateur	mot_de_passe
	public static final String QUERY_CREATE_USER = "INSERT INTO utilisateur (nom_utilisateur, prenom_utilisateur, email, role, statut_utilisateur, mot_de_passe) VALUES (?, ?, ?, ?, ?, ?)";
	public static final String QUERY_UPDATE_USER = "UPDATE SET utilisateur nom_utilisateur=?, prenom_utilisateur=?, email=?, role=?, mot_de_passe=? WHERE id_utilisateur=?";
	public static final String QUERY_DELETE_USER = "DELETE utilisateur WHERE id_utilisateur=?";
	public static final String QUERY_STAUT_USER = "UPDATE SET utilisateur statut_utilisateur=? WHERE id_utilisateur=?";

	
	
	public static final String CHAMP_IS_EMPTY = "\n Veuillez remplir tous les champs !!" ;
	public static final String MSG_CREATE_USER = "\n Utilisateur creer avec succes !!" ;
	public static final String MSG_FAILLED_CREATE_USER = "\n Echec de creation de l'utilisateur !!" ;
	public static final String MSG_UPDATE_USER = "\n Utilisateur modifier avec succes !!" ;
	public static final String MSG_FAILLED_UPDATE_USER = "\n Echec de modification de l'utilisateur !!" ;
	
}
