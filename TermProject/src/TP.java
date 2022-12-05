import java.sql.*;
import java.util.Scanner;

public class TP {
	public static void main(String args[])
	{
		int a = 0;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. connection");
		System.out.println("2. find");
		System.out.println("3. insert");
		System.out.println("99. quit");
		System.out.println("--------------------------------------------------------------");		
		System.out.println("번호 입력: ");
		a = scan.nextInt();

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.56.101:4567/madang", "root","1234");
			Statement stmt=con.createStatement();
			/*
			stmt.executeUpdate("INSERT INTO Book(bookid, bookname, publisher, price) VALUES (20, '스포츠 의학', '한솔의학서적', 90000)");
			ResultSet rs=stmt.executeQuery("SELECT * FROM Book");
				
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
			System.out.println();
			stmt.executeUpdate("DELETE FROM Book WHERE bookid = '20'");
			rs=stmt.executeQuery("SELECT * FROM Book");
				
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
			con.close();
			}catch(Exception e){ System.out.println(e);}
			*/
		}
	}
}
