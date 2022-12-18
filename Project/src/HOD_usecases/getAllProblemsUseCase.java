package HOD_usecases;

import java.util.ArrayList;
import java.util.List;

import com.dao.HODImpl;
import com.dao.HODdao;
import com.exception.*;
import com.models.Problem;
public class getAllProblemsUseCase {

	public static void main(String[] args) {
		
		List<Problem> problems=new ArrayList<>();
		
		HODdao dao=new HODImpl();
		
		try {
			problems=dao.getAllProblems();
			problems.forEach(i->System.out.println(i));
			
		} catch (problemException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
