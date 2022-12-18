package HOD_usecases;

import java.util.Scanner;

import com.dao.HODImpl;
import com.dao.HODdao;


public class RegisterEngineerUseCase1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Engineer's Name:");
		String name=sc.next();
		System.out.println("Enter The Department (Software/Hardware): ");
		String department=sc.next();
		System.out.println("Enter The username(email): ");
		String email=sc.next();
		System.out.println("Enter The Password:");
		String password=sc.next();
		
		HODdao dao=new HODImpl();
		
		String result=dao.registerEngineer2(name, department, email, password);
		
		System.out.println(result);
	}
}
