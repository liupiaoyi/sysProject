/**   
 *       
 * 名称：MenuDTO   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午4:35:12 
 * @version       
 */ 

package cn.com.taiji.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import cn.com.taiji.domain.Menu;
import cn.com.taiji.domain.Role;

/**        
 * 类名称：MenuDTO   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午4:35:12 
 * @version      
 */

public class MenuDTO {
	private String id;

	private String menuDesc;

	private String menuName;

	private String url;
	
	private String menu;
	
	

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	private List<Menu> menus;

	private Role role;

	private List<Role> roles;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenuDesc() {
		return menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public MenuDTO() {
		super();
	}

	public MenuDTO(String id, String menuDesc, String menuName, String url, String menu) {
		super();
		this.id = id;
		this.menuDesc = menuDesc;
		this.menuName = menuName;
		this.url = url;
		this.menu = menu;
	}

	public MenuDTO(String id, String menuDesc, String menuName, String url, String menu, List<Menu> menus, Role role,
			List<Role> roles) {
		super();
		this.id = id;
		this.menuDesc = menuDesc;
		this.menuName = menuName;
		this.url = url;
		this.menu = menu;
		this.menus = menus;
		this.role = role;
		this.roles = roles;
	}

}
