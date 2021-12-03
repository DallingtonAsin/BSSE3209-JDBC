import java.sql.*;
import java.util.*;
public class DbHandler {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // registered our driver
			String username = "Dallington";
			String password="mypassword@pwd";	
			
		//	String url = "jdbc:mysql://localhost/school?user="+username+"&password="+password+"";
//        	Connection con = DriverManager.getConnection(url);
//        	
      		String url = "jdbc:mysql://localhost/BSSE3209"; 
//			Connection con = DriverManager.getConnection(url, username, password);

        	Properties prop = new Properties();
        	prop.put("user", username);
        	prop.put("password", password);
        	Connection con = DriverManager.getConnection(url,  prop);
        	
//        	Statement stmt = con.createStatement();
//        	String query = "CREATE DATABASE BSSE3209";
//        	stmt.execute(query);
        	
//        	Statement stmt = con.createStatement();
//        	String query = "CREATE TABLE students (id int AUTO_INCREMENT primary Key, name VARCHAR(20), regno VARCHAR(40), age int(20) )";
//        	stmt.execute(query);
        	
//        	Statement stmt = con.createStatement();
//        	String query = "DROP TABLE studentArr";
//        	stmt.execute(query);
        	
//        	Scanner input = new Scanner(System.in);
//        	System.out.println("Enter student name:");
//        	String name = input.next();
//        	
//        	System.out.println("Enter student registration no:");
//        	String regno = input.next();
//        	
//        	System.out.println("Enter student age:");
//        	int age = input.nextInt();
        	
//        	String query = "INSERT INTO students(name , regno, age) VALUES(?, ?, ?)";
//        	PreparedStatement stmt = con.prepareStatement(query);
//        	stmt.setString(1, name);
//        	stmt.setString(2, regno);
//        	stmt.setInt(3, age);
        	
        	
//         	String query = "UPDATE students SET name=? where id=?";
//        	PreparedStatement stmt = con.prepareStatement(query);
//        	stmt.setString(1, "Paul KK");
//        	stmt.setInt(2,  2);
        	
//        	String query = "DELETE FROM students where id=?";
//        	PreparedStatement stmt = con.prepareStatement(query);
//        	stmt.setInt(1,  2);
//        	stmt.executeUpdate();
        	
        	Statement stmt = con.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT * from students order by id desc");
        	while(rs.next()) {
        		System.out.println("Name: "+rs.getString("name")+ " Age: "+rs.getInt("age"));
        	}
        	
        	
        	
//        	Statement stmt = con.createStatement();
//        	String query = "INSERT INTO students (name , regno, age) VALUES('Elijah', '18/U/24245/PS', 18)";
//        	stmt.execute(query);
        	
//        	System.out.println("Data deleted successfully");
        	
        	
        	
        	
//        	Statement stmt = con.createStatement();
//        	String query = "DROP DATABASE employees";
//        	stmt.execute(query);
        	
		}catch(Exception e) {
			System.out.println("Got exception "+e.getMessage());
		}
	
	}

}
