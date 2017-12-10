/**   
 *       
 * 名称：RoleRepository   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午2:00:20 
 * @version       
 */ 

package cn.com.taiji.domain;

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
public interface RoleRepository extends JpaRepository<Role, String>,JpaSpecificationExecutor<Role> {

	/**
	 * 按id查询role数据
	 */
	//@Modifying
	@Query("SELECT r FROM Role r where r.id=:id") 
	Role findRoleById(@Param("id") String id);
	
	
	/**
	 * 按id修改角色名
	 */
	@Modifying
	@Query("update Role r set r.roleName=:roleName WHERE r.id=:id")
	void updateRoleNameById(@Param("roleName") String roleName,@Param("id") String id);
	
	
	
}
