package mainFrame;
import java.sql.*;

public class ConnectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dbUrl = "jdbc:mysql://localhost:3306/Login";
		String user = "root";
		String password = "";
		try {
			
			Connection myConn = DriverManager.getConnection(dbUrl, user, password);
			
			Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from students");
			
			while (myRs.next()) {
				System.out.println(myRs.getString("UserName")+' '+myRs.getString("Password"));
				
			}
			
			
			myStmt.close();
			myConn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
