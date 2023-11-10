import java.sql.*;
public class GetProduct {
	public static void main(String[]args)throws Exception {
		get();
	}
	public static void get() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Java";
		String Username="root";
		String password="root";
		//select all
		//String Query="select * from Jdbc  ";
		String Query="select * from Jdbc where id =1002 ";
		Connection con=DriverManager.getConnection(url, Username, password);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("id is :"+rs.getInt(1));
			System.out.println("St_name is :"+rs.getString(2));
			System.out.println("email is :"+rs.getString(3));
			System.out.println("ph_no is :"+rs.getLong(4));
		}
		con.close();
		
	}

}
