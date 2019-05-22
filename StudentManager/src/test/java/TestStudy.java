
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.dao.StudyDao;
import com.student.service.StudentService;
import com.student.service.StudySerivce;
import com.student.vo.Score;

public class TestStudy {
	
	protected ClassPathXmlApplicationContext ctx ;
	
	@Before
	public void init() {
		ctx = new ClassPathXmlApplicationContext("spring/spring-config.xml");		
	}
	
	@Test
	public void test_01() {
//		StudyDao studyDao = ctx.getBean("studyDao",StudyDao.class);
//		System.out.println(studyDao);
//		
		
		
		/*
		 * List<Score> findScore = studySerivce.findScore(null);
		 * System.out.println(findScore);
		 */
	}
}
