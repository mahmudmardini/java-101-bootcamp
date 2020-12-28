package db.connection.mysql.connection.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.connection.mysql.connection.DbConnection;
import db.connection.mysql.connection.DbSQLQuery;
import db.connection.mysql.connection.model.Department;
import db.connection.mysql.connection.model.Employee;
import db.connection.mysql.connection.model.Manager;
import db.connection.mysql.connection.model.Salary;

public class ManagerDAO {

	public List<Manager> loadAllActiveManagers() {
		
		List<Manager> managers = new ArrayList<Manager>();
		
		// Burada halen aktif olarak yöneticilik yapan tüm çalışanları departman isimleriyle birlikte liste halinde hazırlayınız.
		// Manager sınıfını sizin oluşturdum. 
		// İpucu: Bu sorgunun bir benzerini derste anlatmıştım. Hatta "sql_query_samples.sql" dosyası içinde benzeri mevcut.
		
		String sql="SELECT emp.*, dp.dept_name FROM employees emp LEFT JOIN dept_manager dm ON dm.emp_no=emp.emp_no LEFT JOIN departments dp ON dp.dept_no=dm.dept_no where dm.to_date >=NOW()";
		ResultSet setResult = DbSQLQuery.select(sql);
		
		try {
			
			if(setResult == null) return managers;
			
			while(setResult.next()) {
				Employee employee = createEmployee(setResult);
				Manager manager = new Manager(employee, createDepartment(setResult).toString());
				managers.add(manager);
			}
			
		}catch (Exception e) {
			
		}
		
		return managers;
	}
	
	private Employee createEmployee(ResultSet resultSet) throws SQLException {

		Employee employee = new Employee();
		employee.setId(resultSet.getLong("emp_no"));
        employee.setName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setGender(resultSet.getString("gender"));
        employee.setBirthDate(resultSet.getDate("birth_date"));
        employee.setHireDate(resultSet.getDate("hire_date"));

		return employee;
	}
	
	private Department createDepartment(ResultSet resultSet) throws SQLException {
		
		Department department  =new Department();
		department.setName(resultSet.getString("name"));
		
		return department;
	}
	
}
