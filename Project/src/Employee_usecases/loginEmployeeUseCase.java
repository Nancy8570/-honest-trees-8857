package Employee_usecases;

import java.util.Scanner;

import com.dao.EmployeeImpl;
import com.dao.EmployeeeDao;
import com.exception.employeeException;


public class loginEmployeeUseCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Employee Email:");
		String username=sc.nextLine();
		System.out.println("Enter Employee Password:");
		String password=sc.nextLine();
		
		EmployeeeDao dao=new EmployeeImpl();
		try {
			
			com.models.Employee emp=dao.employeeLogin(username, password);
			System.out.println("Welcome "+emp.getName());
			int id=emp.getEmpId();
			Employee_options.Select(id);
			
		} catch (employeeException e) {

			System.out.println(e.getMessage());
		}
	}
}
