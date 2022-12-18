package Employee_usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeImpl;
import com.dao.EmployeeeDao;
import com.exception.employeeException;
import com.models.Problem;



public class Employee_options {

	static EmployeeeDao dao=new EmployeeImpl();
	
	public static void Select(int id) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("\nPlease Select an Option to continue:");
			System.out.println("\n1: Register Complain  \n2: See Status of Problem "
					+ "\n3: See Complain History  \n4: Change Password"
					+ " \n5: Exit The App");
			
				int choice=sc.nextInt();
				
				switch (choice) {
				case 1:
					Problem p=new Problem();
					
					System.out.println("Enter the Type Of Problem: (Hardware/SoftWare)");
					String type=sc.next();
					System.out.println("Enter Small Description of Problem:");
					String desc=sc.next();
					System.out.println("Enter Date (YYYY-MM-DD):");
					String date=sc.next();
					
					p.setType(type);
					p.setDescription(desc);
					p.setDate(date);
					
					String result=dao.registerComplain(p,id);
					System.out.println(result);
					
					Employee_options.Select(id);
					break;
				case 2:
					System.out.println("Enter the problem Id:");
					int probId=sc.nextInt();
					
					String result1=dao.viewStatus(probId);
					System.out.println(result1);
					
					Employee_options.Select(id);
					break;
					
				case 3:
					List<Problem> problems=new ArrayList<>();
					
					EmployeeeDao dao=new EmployeeImpl();
					
					problems=dao.checkHistory(id);
					problems.forEach(i-> System.out.println(i));
					
					Employee_options.Select(id);
					break;
				case 4:
					System.out.println("Enter Your username:");
					String username=sc.next();
					System.out.println("Enter Your Password");
					String password=sc.next();
					
					String result3=Employee_options.dao.updatePassword(username, password);
					System.out.println(result3);
					
					Employee_options.Select(id);
					break;
					
				case 5:
					return;
					
				default:
					System.out.println("Wrong Input..!");
					Employee_options.Select(id);
					break;
			
		}
		}catch (employeeException e) {
			System.out.println(e.getMessage());
			Employee_options.Select(id);
		}
}
}
