/**   
 *       
 * 名称：RoleDTO   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午4:35:52 
 * @version       
 */ 

package cn.com.taiji.dto;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import cn.com.taiji.domain.Menu;
import cn.com.taiji.domain.User;

/**        
 * 类名称：RoleDTO   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午4:35:52 
 * @version      
 */

public class RoleDTO {
	
	//@Column(length=10, nullable=false)  //长度为10，且不能为空
	private String id;

	private String roleDesc;

	@NotEmpty(message="not empty")
	private String roleName;

	private Menu menu;

	private List<Menu> menus;

	private List<User> users;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public RoleDTO(String id, String roleDesc, String roleName, Menu menu, List<Menu> menus, List<User> users) {
		super();
		this.id = id;
		this.roleDesc = roleDesc;
		this.roleName = roleName;
		this.menu = menu;
		this.menus = menus;
		this.users = users;
	}

	public RoleDTO() {
		super();
	}

	public RoleDTO(String id, String roleDesc, String roleName) {
		super();
		this.id = id;
		this.roleDesc = roleDesc;
		this.roleName = roleName;
	}

}
