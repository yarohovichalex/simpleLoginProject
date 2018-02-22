package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class LoginDao implements BaseDao{
	
	private static final String url = "jdbc:mysql://localhost/logindb?"
			+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode"
			+ "=false&serverTimezone=UTC&useSSL=false";


	@Override
	public void doSmth() {
		List<String> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
		} catch (ClassNotFoundException e1) {			
			e1.printStackTrace();
		}
		
		try(Connection cn = DriverManager.getConnection(url,"root","root")){
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from user;");
			

			while(rs.next()) {
				list.add(rs.getString("name"));
				System.out.println(rs.getString("name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	

}
