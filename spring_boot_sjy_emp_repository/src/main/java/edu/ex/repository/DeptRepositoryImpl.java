package edu.ex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ex.vo.DeptVO;

@Repository // @Component + 의미(DAO)
public class DeptRepositoryImpl implements DeptRepository {

//   public MemberDao() {
//      try {
//         Context context = new InitialContext();
//         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//   }
	@Autowired
	private DataSource dataSource;

	@Override
	public List<DeptVO> selectList() {
		List<DeptVO> deptList = new ArrayList<DeptVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;

		try {
			String query = "select * from dept";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				DeptVO dept = new DeptVO(deptno, dname, loc);
				deptList.add(dept);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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

		return deptList;
	}
	public void insert(DeptVO deptVO) {
		
		Connection conn = null;
		PreparedStatement psmt = null;

		try {

			String sql = "insert into  dept values (?,?,? )";

			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, deptVO.getDeptno());
			psmt.setString(2,  deptVO.getDname());
			psmt.setString(3, deptVO.getLoc());

			int rn = psmt.executeUpdate();

			System.out.println("insert 된 갯수" + rn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return;		
		
	}
}