import java.sql.*;
public class Updateproduct {
	public static void main(String[]args)throws Exception {
		update();
	}
	public static void update() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Java";
		String Username="root";
		String password="root";
		String Query="update Jdbc set St_name='balaji' where id=1002";
		Connection con=DriverManager.getConnection(url, Username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
		
	}
}
