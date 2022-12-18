package Engineer_usecases;
import java.util.Scanner;

import com.dao.EngineerDao;
import com.dao.EngineerImpl;
import com.exception.engineerException;
import com.models.Engineer;

public class engineerLoginUseCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Engineer UserName:");
		String username=sc.next();
		System.out.println("Enter Engineer Password:");
		String password=sc.next();
		
		EngineerDao dao=new EngineerImpl();
		
		try {
			Engineer eng=dao.loginToSystem(username, password);
			System.out.println("Welcome "+eng.getName());
			int id=eng.getEngineerId();
			
			Engineer_usecases.Engineer_options.Select(id);
		
		} catch (engineerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
