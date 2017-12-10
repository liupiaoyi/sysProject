/**   
 *       
 * 名称：RoleTests   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月9日 下午1:07:57 
 * @version       
 */ 

package cn.com.taiji.tests;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.taiji.service.RoleService;

/**        
 * 类名称：RoleTests   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月9日 下午1:07:57 
 * @version      
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTests {
	
	@Autowired
	RoleService roleService;
//	
//	@Test
//	public void addTest() {
//		RoleDTO addRole = roleService.addRole( new RoleDTO("id", "roleDesc", "roleName",null,null,null) );
//		System.out.println(addRole);
//	}

}
