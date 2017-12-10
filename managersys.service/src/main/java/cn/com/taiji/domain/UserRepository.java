/**   
 *       
 * 名称：RoleRepository   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午2:00:20 
 * @version       
 */ 

package cn.com.taiji.domain;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**        
 * 类名称：RoleRepository   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午2:00:20 
 * @version      
 */
@Transactional
public interface UserRepository extends JpaRepository<User, String>,JpaSpecificationExecutor<User> {

	/**
	 * 按id查询user数据
	 */
	//@Modifying
	@Query("SELECT u FROM User u where u.id=:id") 
	User findUserById(@Param("id") String id);
	
	//姓名查找
	@Query("SELECT u FROM User u where u.userName=:userName") 
	List<User> findUserByUsername(@Param("userName") String userName);
	
	
	/**
	 * 删除用户
	 */
	@Modifying	//注解完成修改操作(注意:不支持新增)
	@Query("delete from User u where u.id=:id")
	int deleteById(@Param("id") String id);
	
	
	
}
