package HOD_usecases;

import java.util.Scanner;
import com.dao.HODImpl;
import com.dao.HODdao;
import com.exception.*;


public class DeleteEngineerUseCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Engineer-Id to Delete: ");
		
		int id=sc.nextInt();
		
		HODdao dao=new HODImpl();
		
		try {
			String result = dao.deleteEngineerById(id);
				
			System.out.println(result);
		} catch (engineerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}	
	}
}
