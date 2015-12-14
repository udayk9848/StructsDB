package com.uday.struts.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.uday.struts.form.LoginForm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRegisterDAO {
	public void insertData(String firstName, String lastName, String userName, String password, String email,
			String phone) throws Exception {
		System.out.println("jdbc connection");
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
			
			Statement st = con.createStatement();
			int value = st
					.executeUpdate("INSERT INTO USER_DETAILS(FIRST_NAME,LAST_NAME,USER_NAME,PASSWORD,EMAIL,PHONE) "
							+ "VALUES('" + firstName + "','" + lastName + "','" + userName + "','" + password + "','"
							+ email + "','" + phone + "')");
			System.out.println("1 row affected" + "  " + value);
		} catch (SQLException ex) {
			System.out.println("SQL statement is not executed!" + ex);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

	public String deleteData(String userName) {
		// TODO Auto-generated method stub
		System.out.println("jdbc connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			try {
				PreparedStatement updatecust = con.prepareStatement("DELETE FROM USER_DETAILS WHERE USER_NAME = ?");

				updatecust.setString(1, userName);

				int val = updatecust.executeUpdate();

				if (val == 0) {
					System.out.println(" User Not Found");
					return "notfound";
				}

				System.out.println(" row affected  " + val);
			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "found";

	}

	public EmpPojo EmpData(String userName) {
		System.out.println("validate jdbc connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		EmpPojo Emp = new EmpPojo();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			try {
				PreparedStatement updatecust = con.prepareStatement("SELECT * FROM USER_DETAILS WHERE USER_NAME = ?");

				updatecust.setString(1, userName);
				/* updatecust.setString(2, password); */
				ResultSet rs = updatecust.executeQuery();

				while (rs.next()) {
					String firstName = rs.getString("FIRST_NAME");
					String lastName = rs.getString("LAST_NAME");
					userName = rs.getString("USER_NAME");
					String password = rs.getString("PASSWORD");
					String email = rs.getString("EMAIL");
					String phone = rs.getString("PHONE");
					Emp.setFirstName(firstName);
					Emp.setLastName(lastName);
					Emp.setUserName(userName);
					Emp.setPassword(password);
					Emp.setEmail(email);
					Emp.setPhone(phone);
					System.out.println("details of " + Emp.getUserName());
				}
				if (Emp.getFirstName() == null) {
					Emp.setEmail("notfound");
				}

			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return Emp;
	}

	public void updateData(String firstName, String lastName, String userName, String password, String email,
			String phone, String ouserName) {
		// TODO Auto-generated method stub
		System.out.println("jdbc connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			try {
				PreparedStatement updatecust1 = con.prepareStatement("set sql_safe_updates=0");
				updatecust1.executeQuery();
				PreparedStatement updatecust = con.prepareStatement(
						"update USER_DETAILS set FIRST_NAME=?,LAST_NAME=?,USER_NAME=?,PASSWORD=?,EMAIL=?,PHONE=? "
								+ "where USER_NAME=?");
				updatecust.setString(1, firstName);
				updatecust.setString(2, lastName);
				updatecust.setString(3, userName);
				updatecust.setString(4, password);
				updatecust.setString(5, email);
				updatecust.setString(6, phone);
				updatecust.setString(7, ouserName);
				/* updatecust.setString(8, opassword); */
				int value = updatecust.executeUpdate();
				System.out.println(" row affected" + "  " + value);
				System.out.println(firstName + "  " + lastName + "  " + userName + "  " + password + "  " + email + "  "
						+ phone + "old " + ouserName);
			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void EupdateData(String firstName, String lastName, String userName, String password, String email,
			String phone, String ouserName, String opassword) {
		// TODO Auto-generated method stub
		System.out.println("jdbc connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			try {
				PreparedStatement updatecust1 = con.prepareStatement("set sql_safe_updates=0");
				updatecust1.executeQuery();
				PreparedStatement updatecust = con.prepareStatement(
						"update USER_DETAILS set FIRST_NAME=?,LAST_NAME=?,USER_NAME=?,PASSWORD=?,EMAIL=?,PHONE=? "
								+ "where USER_NAME=? and PASSWORD=?");
				updatecust.setString(1, firstName);
				updatecust.setString(2, lastName);
				updatecust.setString(3, userName);
				updatecust.setString(4, password);
				updatecust.setString(5, email);
				updatecust.setString(6, phone);
				updatecust.setString(7, ouserName);
				updatecust.setString(8, opassword);
				int value = updatecust.executeUpdate();
				System.out.println(" row affected" + "  " + value);
				System.out.println(firstName + "  " + lastName + "  " + userName + "  " + password + "  " + email + "  "
						+ phone + "old" + ouserName + "  " + opassword);
			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<EmpPojo> Search() {
		System.out.println("Search jdbc connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		ArrayList<EmpPojo> list = new ArrayList<EmpPojo>();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			try {
				PreparedStatement updatecust = con.prepareStatement("SELECT * FROM USER_DETAILS  ");

				ResultSet rs = updatecust.executeQuery();

				while (rs.next()) {
					EmpPojo Emp = new EmpPojo();
					String firstName = rs.getString("FIRST_NAME");
					String lastName = rs.getString("LAST_NAME");
					String userName = rs.getString("USER_NAME");
					String password = rs.getString("PASSWORD");
					String email = rs.getString("EMAIL");
					String phone = rs.getString("PHONE");
					Emp.setFirstName(firstName);
					Emp.setLastName(lastName);
					Emp.setUserName(userName);
					Emp.setPassword(password);
					Emp.setEmail(email);
					Emp.setPhone(phone);
					System.out.println("details of " + Emp.getUserName());
					list.add(Emp);
				}

			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return list;
		// TODO Auto-generated method stub

	}

	public EmpPojo SerchData(String userName, String password) {
		System.out.println("Search validate jdbc connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		EmpPojo Emp = new EmpPojo();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			try {
				PreparedStatement updatecust = con
						.prepareStatement("SELECT * FROM USER_DETAILS WHERE USER_NAME = ? and PASSWORD = ? ");

				updatecust.setString(1, userName);
				updatecust.setString(2, password);
				ResultSet rs = updatecust.executeQuery();

				while (rs.next()) {
					String firstName = rs.getString("FIRST_NAME");
					String lastName = rs.getString("LAST_NAME");
					userName = rs.getString("USER_NAME");
					password = rs.getString("PASSWORD");
					String email = rs.getString("EMAIL");
					String phone = rs.getString("PHONE");
					Emp.setFirstName(firstName);
					Emp.setLastName(lastName);
					Emp.setUserName(userName);
					Emp.setPassword(password);
					Emp.setEmail(email);
					Emp.setPhone(phone);
					System.out.println("details of " + Emp.getUserName());
				}
				if (Emp.getFirstName() == null) {
					Emp.setEmail("notfound");
				}

			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return Emp;
	}

	public EmpPojo valid(String userName, String password) {
		// TODO Auto-generated method stub
		System.out.println("validate jdbc connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		EmpPojo Emp = new EmpPojo();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			try {
				PreparedStatement updatecust = con
						.prepareStatement("SELECT * FROM USER_DETAILS WHERE USER_NAME = ? and PASSWORD = ? ");

				updatecust.setString(1, userName);
				updatecust.setString(2, password);
				ResultSet rs = updatecust.executeQuery();

				while (rs.next()) {
					String firstName = rs.getString("FIRST_NAME");
					String lastName = rs.getString("LAST_NAME");
					userName = rs.getString("USER_NAME");
					password = rs.getString("PASSWORD");
					String email = rs.getString("EMAIL");
					String phone = rs.getString("PHONE");
					Emp.setFirstName(firstName);
					Emp.setLastName(lastName);
					Emp.setUserName(userName);
					Emp.setPassword(password);
					Emp.setEmail(email);
					Emp.setPhone(phone);
					System.out.println("details of " + Emp.getUserName());
				}
				if (Emp.getFirstName() == null) {
					Emp.setEmail("notfound");
				}

			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return Emp;

	}

	public String usernamevalidation(String userName) {
		// TODO Auto-generated method stub
		System.out.println("validate jdbc connection");
		System.out.println(" jdbc connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		EmpPojo Emp = new EmpPojo();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			try {
				PreparedStatement updatecust = con.prepareStatement("SELECT * FROM USER_DETAILS WHERE USER_NAME = ?");

				updatecust.setString(1, userName);
				ResultSet rs = updatecust.executeQuery();

				if (!rs.next()) {
					Emp.setUserName("notfound");
				} else {
					Emp.setUserName(userName);
					System.out.println(Emp.getUserName());
					System.out.println("found");
				}

			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Emp.getUserName());
		// TODO Auto-generated method stub
		return Emp.getUserName();

	}

	/**
	 * DAO methos t return employee object
	 * 
	 * @param loginForm
	 * @return
	 */
	public EmpPojo getEmployee(LoginForm loginForm) {
		System.out.println("validate jdbc connection");

		EmpPojo empPojo = new EmpPojo();

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB", "root", "admin");

			PreparedStatement preparedStatement = con
					.prepareStatement("SELECT * FROM USER_DETAILS WHERE USER_NAME = ? and PASSWORD = ? ");

			preparedStatement.setString(1, loginForm.getUserName());
			preparedStatement.setString(2, loginForm.getPassword());
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				empPojo.setFirstName(rs.getString("FIRST_NAME"));
				empPojo.setLastName(rs.getString("LAST_NAME"));
				empPojo.setUserName(rs.getString("USER_NAME"));
				empPojo.setPassword(rs.getString("PASSWORD"));
				empPojo.setEmail(rs.getString("EMAIL"));
				empPojo.setPhone(rs.getString("PHONE"));

				
			}

			if (empPojo.getFirstName() == null) {
				empPojo.setEmail("notfound");
				return empPojo;
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return empPojo;
	}
}
