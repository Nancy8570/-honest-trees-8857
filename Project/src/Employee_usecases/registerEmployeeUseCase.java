package Employee_usecases;

import java.util.Scanner;

import com.dao.EmployeeImpl;
import com.dao.EmployeeeDao;
import com.exception.employeeException;


public class registerEmployeeUseCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Employee Name:");
		String name=sc.nextLine();
		System.out.println("Enter Username(email):");
		String username=sc.nextLine();
		System.out.println("Enter Password:");
		String password=sc.nextLine();
		
		com.models.Employee employee=new com.models.Employee();
		employee.setName(name);
		employee.setUserName(username);
		employee.setPassword(password);
		
		EmployeeeDao dao=new EmployeeImpl();
		try {
			String result=dao.registerEmployee(employee);
			System.out.println(result);
		} catch (employeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
