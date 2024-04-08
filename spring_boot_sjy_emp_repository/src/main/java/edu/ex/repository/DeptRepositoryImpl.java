package edu.ex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import edu.ex.vo.DeptVO;

// 스프링 컨테이너안에서 객체 생성.
@Repository //@component +의미(DAO)
public class DeptRepositoryImpl implements DeptRepository{
//	public MemberDao() {
//		try {
//			// InitialContext를 사용하여 컨텍스트를 생성합니다.
//			Context context = new InitialContext();
//			// "java:comp/env/jdbc/oracle" 이름으로 등록된 데이터 소스를 찾아서 DataSource로 형변환하여 가져옵니다.
//			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}	
	private DataSource  dataSource;
	@Override
	public List<DeptVO> selectList(){
		List<DeptVO> deptList = new ArrayList<DeptVO>();
		
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet rs = null;		
				
		try {
			String query = "select * from dept";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				DeptVO dept = new DeptVO(deptno,dname,loc);
				deptList.add(dept);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
	         try {
	             if (rs != null)
	                rs.close();
	             if (preparedStatement != null)
	                preparedStatement.close();
	             if (connection != null)
	                connection.close();
	          } catch (Exception e2) {
	             e2.printStackTrace();
	          }
	       }	
		
		return null;
	}
	
}
