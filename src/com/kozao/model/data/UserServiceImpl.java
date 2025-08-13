package com.kozao.model.data;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

import com.kozao.model.access.ConnexionDB;
import com.kozao.model.objet.User;
import com.kozao.util.Constante;

public class UserServiceImpl implements UserService {

	public static String msg = "";
	public static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

	public UserServiceImpl() {
	}

	@Override
	public void addUser(User user) {

		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.QUERY_CREATE_USER);

			pre.setString(1, user.getUserName());
			pre.setString(2, user.getUserFirstName());
			pre.setString(3, user.getUserEmail());
			pre.setString(4, user.getUserRole());
			pre.setBoolean(5, true);
			pre.setString(6, user.getPassWord());

			pre.executeUpdate();

			msgUser = Constante.MSG_CREATE_USER;


		} catch (Exception e) {

			msgUser = Constante.MSG_FAILED_CREATE_USER + " Erreur == " + e.getMessage();
		}

	}

	@Override
	public void updateUser(User user) {

		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.QUERY_UPDATE_USER);

			pre.setString(1, user.getUserName());
			pre.setString(2, user.getUserFirstName());
			pre.setString(3, user.getUserEmail());
			pre.setString(4, user.getUserRole());
			pre.setBoolean(5, true);
			pre.setString(6, user.getPassWord());

			pre.executeUpdate();

			msgUser = Constante.MSG_UPDATE_USER;

		} catch (Exception e) {

			logger.error(Constante.MSG_FAILED_UPDATE_USER + " Erreur == " + e.getMessage());
			// msgUser = Constante.MSG_FAILED_UPDATE_USER + " Erreur == " + e.getMessage();
		}

	}
	
	
	@Override
	public void updateUserProfil(User user) {
		
		try {

			Connection con = ConnexionDB.getConnection();
            
			
			
			PreparedStatement pre = con.prepareStatement(Constante.QUERY_UPDATE_USER_PROFIL);

			pre.setString(1, user.getUserName());
			pre.setString(2, user.getUserFirstName());
			pre.setString(3, user.getUserEmail());
			pre.setInt(4, user.getIdUser());

			pre.executeUpdate();

			msgUser = Constante.MSG_UPDATE_PROFIL;

		} catch (Exception e) {

			logger.error(Constante.MSG_FAILED_UPDATE_PROFIL + " Erreur == " + e.getMessage());
			// msgUser = Constante.MSG_FAILED_UPDATE_PROFIL + " Erreur == " + e.getMessage();
		}
	}
	
	
	public void  updatePassWord(String oldPassword, String newPassword) {
        
		if (!findPassWord(oldPassword)) {
			msgUser = Constante.MSG_PASSWORD_NOT_EXIST;
			return ;
		}
		
		try {
			
			Connection con = ConnexionDB.getConnection();
			PreparedStatement pre = con.prepareStatement(Constante.QUERY_UPDATE_PASSWORD);

			pre.setString(1, oldPassword);
			pre.setString(2, newPassword);

			pre.executeUpdate();
			
			msgUser = Constante.MSG_UPDATE_PASSWORD;

		} catch (Exception e) {
			
			msgUser = Constante.MSG_FAILED_UPDATE_PASSWORD + " Erreur == " + e.getMessage();
		}

	}
	
	
	public boolean findPassWord(String passWord) {

		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.QUERY_FIND_PASSWORD);

			pre.setString(1, passWord);


			int rst = pre.executeUpdate();
			
			if (rst > 0) {
				return true;
			}

		}catch (Exception e) {

			msgUser = " Erreur == " + e.getMessage();
		}
        return false;
	}

	
	
	@Override
	public int disableUser(int id) {
		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.QUERY_STAUT_USER);

			pre.setBoolean(1, false);
			pre.setInt(2, id);

			id = pre.executeUpdate();

			// msg = Constante.MSG_CREATE_USER;

			return id;

		} catch (Exception e) {

			// msg = Constante.MSG_FAILLED_CREATE_USER + " Erreur == " + e.getMessage();

			return 0;
		}

	}

	@Override
	public int enableUser(int id) {
		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.QUERY_STAUT_USER);

			pre.setBoolean(1, true);
			pre.setInt(2, id);

			id = pre.executeUpdate();

			// msg = Constante.MSG_CREATE_USER;

			return id;

		} catch (Exception e) {

			// msg = Constante.MSG_FAILLED_CREATE_USER + " Erreur == " + e.getMessage();
			return 0;
		}
	}

	@Override
	public int deleteUser(int id) {
		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.QUERY_DELETE_USER);
			pre.setInt(1, id);

			id = pre.executeUpdate();

			// msg = Constante.MSG_CREATE_USER;

			return id;

		} catch (Exception e) {

			// msg = Constante.MSG_FAILLED_CREATE_USER + " Erreur == " + e.getMessage();
			return 0;
		}
	}

	@Override
	public User findUserById(int id) {

		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.QUERY_FIND_USER_BY_ID);

			pre.setInt(1, id);

			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				User user = new User();

				user.setIdUser(rs.getInt("id_user"));
				user.setUserName(rs.getString("user_name"));
				user.setUserFirstName(rs.getString("user_first_name"));
				user.setUserEmail(rs.getString("email"));
				user.setUserRole(rs.getString("user_role"));
				user.setUserStatus(rs.getBoolean("user_status"));

				return user;
			}

		} catch (Exception e) {

			msg = Constante.MSG_FAILLED_CREATE_USER + " Erreur == " + e.getMessage();
			return null;
		}

		return null;

	}

	@Override
	public User findUserByName(String name) {

		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.);

			pre.setString(1, name);

			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				User user = new User();

				user.setIdUser(rs.getInt("id_user"));
				user.setUserName(rs.getString("user_name"));
				user.setUserFirstName(rs.getString("user_first_name"));
				user.setUserEmail(rs.getString("email"));
				user.setUserRole(rs.getString("user_role"));
				user.setUserStatus(rs.getBoolean("user_status"));

				return user;
			}

		} catch (Exception e) {

			msg = Constante.MSG_FAILLED_CREATE_USER + " Erreur == " + e.getMessage();
			return null;
		}
		return null;
	}

	@Override
	public User findUserByFirstName(String firstName) {

		try {

			Connection con = ConnexionDB.getConnection();

			PreparedStatement pre = con.prepareStatement(Constante.QUERY_FIND_USER_BY_FIRST_NAME);

			pre.setString(1, firstName);

			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				User user = new User();

				user.setIdUser(rs.getInt("id_user"));
				user.setUserName(rs.getString("user_name"));
				user.setUserFirstName(rs.getString("user_first_name"));
				user.setUserEmail(rs.getString("email"));
				user.setUserRole(rs.getString("user_role"));
				user.setUserStatus(rs.getBoolean("user_status"));

				return user;
			}

		} catch (Exception e) {

			msg = Constante.MSG_FAILLED_CREATE_USER + " Erreur == " + e.getMessage();
			return null;
		}

		return null;

	}

	@Override
	public List<User> findAllUser() {

		List<User> allUser = new ArrayList<>();

		try  {
			Connection con = ConnexionDB.getConnection();

			Statement stm = con.createStatement();


			ResultSet rs = stm.executeQuery(Constante.QUERY_FIND_USER_BY_FIRST_NAME);
			while (rs.next()) {
				User user = new User();

				user.setIdUser(rs.getInt("id_user"));
				user.setUserName(rs.getString("user_name"));
				user.setUserFirstName(rs.getString("user_first_name"));
				user.setUserEmail(rs.getString("email"));
				user.setUserRole(rs.getString("user_role"));
				user.setUserStatus(rs.getBoolean("user_status"));

				allUser.add(user);
			}
			
			return allUser;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allUser;
	}


}
