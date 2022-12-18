package HOD_usecases;

import java.util.ArrayList;
import java.util.List;

import com.dao.HODImpl;
import com.dao.HODdao;
import com.exception.*;
import com.models.Engineer;
public class ListAllEngineerUseCase {

	public static void main(String[] args) {
		List<Engineer> engineers=new ArrayList<>();
		
		HODdao dao=new HODImpl();
		
		try {
			engineers=dao.getAllEngineerDetails();
			
			engineers.forEach(i->System.out.println(i));
			
		} catch (engineerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
