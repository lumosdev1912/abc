import java.sql.*;
public class Deleteproduct {
	public static void main(String[]args)throws Exception {
		delete();
	}
	public static void delete() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Java";
		String Username="root";
		String password="root";
		String Query="delete from jdbc where id = 1001;";
		Connection con=DriverManager.getConnection(url, Username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
		
	}

}
