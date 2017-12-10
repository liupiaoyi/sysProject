/**   
 *       
 * 名称：Usertest   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午2:09:49 
 * @version       
 */ 

package cn.com.taiji.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.taiji.domain.RoleRepository;

/**        
 * 类名称：Usertest   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午2:09:49 
 * @version      
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Usertest {
	
//	private static final Logger log = LoggerFactory.getLogger(Usertest.class);
//	
	@Autowired
	RoleRepository rore;
	
	@Test
	public void test1() {
		long count = rore.count();
		System.out.println(count);
		System.out.println("ok");
	}

}
