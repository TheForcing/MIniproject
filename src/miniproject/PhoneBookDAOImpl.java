package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PhoneBookDAOImpl implements PhoneBookDao {
	private static Connection conn;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
public PhoneBookDAOImpl() {
	
}
private void getConnection( )throws ClassNotFoundException,SQLException{
	if(conn== null) {
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user="C##bituser";
		String pw="bituser";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn= DriverManager.getConnection(url,user,pw);
	}
}
@Override
public List<PhonebookVO> getlist() {
	PhonebookVO vo= null;
	try {
		getConnection();
		
		String sql= "SELECT id, name, hp, tel from Phone_book Where id=?";
		PreparedStatement pstmt= conn.prepareStatement(sql);
		ResultSet r= pstmt.executeQuery();
		
		if(r.next()) {
			String id= r.getString("id");
			String name=r.getString("name");
			String tel=r.getString("tel");
			String hp=r.getString("hp");
			
		
		}} catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	return list;

}

@Override
public String insert(PhonebookVO vo) {
 try{
		getConnection();
		
		String sql= "INSERT INTO PHONE_BOOK VALUES(LPAD(Seq_phone_book.nextval,4,'0'),:id,:name,:hp,:tel)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setLong(1, vo.getId());
		pstmt.setString(2, vo.getName());
		pstmt.setLong(3, vo.getHp());
		pstmt.setLong(4, vo.getTel());
		
		int r= pstmt.executeUpdate();
		
		if(r>0) result = true;
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		
	}
	return result;
}
@Override
public String delete(PhonebookVO vo) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String search(PhonebookVO vo) {
	try {
		getConnection();
		String sql ="SELECCT id , name, hp, tel From Phone_book WHERE id=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet r= pstmt.executeQuery();
		
		if(r.next()) {
			String id=r.getString("id");
			String name=r.getString("name");
			String hp=r.getString("hp");
			String tel=r.getString("tel");
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		
	} finally {
		
	}
}
@Override
public String exit(PhonebookVO vo) {
	// TODO Auto-generated method stub
	return null;
}
	
}
