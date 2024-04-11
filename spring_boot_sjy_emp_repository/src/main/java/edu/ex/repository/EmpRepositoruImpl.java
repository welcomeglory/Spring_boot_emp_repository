package edu.ex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ex.vo.EmpVO;

@Repository // @Component + 의미(DAO)
public class EmpRepositoruImpl implements EmpRepository {

	@Autowired
	private DataSource dataSource;

	@Override
	public List<EmpVO> selectList() {
		List<EmpVO> empList = new ArrayList<EmpVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;

		try {
			String query = "select * from emp";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Timestamp hiredate = rs.getTimestamp("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");

				EmpVO emp = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno,null);
				empList.add(emp);
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

		return empList;
	}
	public void insert(EmpVO empVO) {
		int result = 0;
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			String sql = "insert into  emp values (?,?,?,?,?,?,?,?)";

			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1,empVO.getEmpno());
			psmt.setString(2, empVO.getEname());
			psmt.setString(3, empVO.getJob());
			psmt.setInt(4,empVO.getMgr());
			psmt.setString(5, empVO.getHiredate1());//2024-05-06,2024/05/06
			psmt.setInt(6,empVO.getSal());
			psmt.setInt(7,empVO.getComm());
			psmt.setInt(8,empVO.getDeptno());

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
	
	}
	public void delete(int empno) {

		Connection conn = null;
		PreparedStatement psmt = null;

		try {

			String sql = "delete from emp where empno=?";

			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, empno);
			
			int rn = psmt.executeUpdate();
			System.out.println("delete 된 갯수" + rn);

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