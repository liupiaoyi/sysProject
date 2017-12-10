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
public interface MenuRepository extends JpaRepository<Menu, String>,JpaSpecificationExecutor<Menu> {

	/**
	 * 按id查询Menu数据
	 */
	//@Modifying
	@Query("SELECT m FROM Menu m where m.id=:id") 
	Menu findMenuById(@Param("id") String id);
	
	
	/**
	 * 查询子节点
	 */
	@Query("SELECT m FROM Menu m where m.menu=:menum")
	List<Menu> findAllChildren(@Param("menu") Menu menu);
	
	
	/**
	 * 修改菜单信息
	 */
	@Modifying
	@Query("update Menu m set m.menuName=:menuName, m.menuDesc=:menuDesc, m.url=:url,m.menu=:menu where m.id=:id")
	int updateMenu(@Param("menuName") String menuName,@Param("menuDesc") String menuDesc, @Param("url")String url,@Param("menu")Menu menus,@Param("id") String id);

	
	
}
