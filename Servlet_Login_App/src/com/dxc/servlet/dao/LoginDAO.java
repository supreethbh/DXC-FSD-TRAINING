package com.dxc.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    public boolean check(String userName, String password) {

	try {

	    Class.forName("com.mysql.jdbc.Driver");

	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc", "root", "data");

	    String sql = " SELECT * FROM LOGIN " + " WHERE UserName = ?, Password = ? ;";

	    PreparedStatement statement = con.prepareStatement(sql);

	    statement.setString(1, userName);
	    statement.setString(2, password);

	    ResultSet result = statement.executeQuery();

	    if (result.next()) {
		return true;
	    }

	} catch (ClassNotFoundException e) {
	    e.printStackTrace();

	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return false;
    }
}
