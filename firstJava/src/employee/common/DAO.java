package employee.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import employee.model.Department;

public class DAO {
	static Connection conn;

	public static void getCon() throws ClassNotFoundException, SQLException {
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pw);

	}

	public static void insertEmp(Employee emp) {
		try {
			getCon();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		String sql = "insert into emp_temp" + "(employee_id, last_name, email, hire_date, job_id)"
				+ "values(?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());
			pstmt.setString(3, emp.getEmail());
			pstmt.setString(4, emp.getHireDate());
			pstmt.setString(5, emp.getJobid());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static List<Departments> getDeptList() {
		try {
			getCon();
			List<Departments> temp_dept = new ArrayList<>();
			Departments d1 = new Departments();
			String sql = "select * from departments";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.execute();
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				d1 = new Departments();
				d1.setDepartment_Id(rs.getInt("department_id"));
				d1.setDepartment_Name(rs.getString("department_name"));
				d1.setManager_Id(rs.getInt("manager_id"));
				d1.setLocation_ID(rs.getInt("location_id"));
				temp_dept.add(d1);
			}
			return temp_dept;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return null;
	}

	public static void updateEmp() {
		try {
			getCon();
			String sql = "update emp_temp set employee_id = 12345 where email = 'ggggg'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			System.out.println("check3");
			pstmt.execute();
			System.out.println("check4");
			System.out.println("Update 되었습니다.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static List<Employee> getEmpList() throws ClassNotFoundException, SQLException {
		getCon();
		List<Employee> list = new ArrayList<>();
		String sql = "select employee_id, first_name, last_name, salary from emp_temp order by 1 desc";
		Employee emp = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
//		Employee emp = new Employee();
//		emp.setEmployeeId(999);
//		emp.setLastName("last_name");
//		emp.setEmail("LASTNAME");
//		emp.setJobid("IT_PROD");
//		emp.setHireDate("2010-05-01");
//		insertEmp(emp);
//		List<Employee> list = getEmpList();
//		for (Employee str : list) {
//			System.out.println("사번:" + str.getEmployeeId() + ", 이름:" + str.getFirstName() + ", 성:" + str.getLastName()
//					+ ", 급여:" + str.getSalary());
//		}
	}
}
