import java.sql.*;
public class Insertproduct {
	public static void main(String[]args)throws Exception {
		insert();
	}
	public static void insert() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Java";
		String Username="root";
		String password="root";
		String Query="insert into Jdbc values(?,?,?,?)";
		Connection con=DriverManager.getConnection(url, Username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1, 1001);
		pst.setString(2, "jagan");
		pst.setString(3, "jagan@gmail.com");
		pst.setLong(4, 1234567890);
		pst.executeUpdate();
		con.close();
		
	}

}
