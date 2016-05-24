package springTask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class SpringTaskTest {

	@Test
	public void test() {
		int times = 30 ;
		for (int i = 0; i < times; i++) {
			System.out.println("不要理我，我只是一个日志而已++++++++++++");
			try {
				Thread.sleep(i * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
		}
	}

}
