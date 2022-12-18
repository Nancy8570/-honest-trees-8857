package HOD_usecases;

import java.util.Scanner;

import com.dao.HODImpl;
import com.dao.HODdao;
import com.exception.*;


public class AssignProblemUseCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Engineer Id:");
		int engId=sc.nextInt();
		System.out.println("Enter the Problem Id:");
		int probId=sc.nextInt();
		
		HODdao dao=new HODImpl();
		
		try {
			String result=dao.assignProblem(engId,probId);
			
			System.out.println(result);
		} catch (engineerException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
