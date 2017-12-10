/**   
 *       
 * 名称：RoleController   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月9日 下午1:00:19 
 * @version       
 */ 

package cn.com.taiji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.taiji.domain.Role;
import cn.com.taiji.dto.RoleDTO;
import cn.com.taiji.service.RoleService;

/**        
 * 类名称：RoleController   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月9日 下午1:00:19 
 * @version      
 */

@Controller
public class RoleController {

	@Autowired
	RoleService roleService;
	
	
	// 转到新增用户界面
	@RequestMapping("add")
	public String add() {
		return "add";
	}
	
	
	//新增用户
	@RequestMapping("/addRole")
	public String addRole(@RequestParam("id") String id,@RequestParam("role_name") String role_name,@RequestParam("role_desc") String role_desc) {
		RoleDTO addRole = roleService.addRole(new RoleDTO(id,role_name,role_desc));
		System.out.println(addRole);
		return "index";
	}
	
	
	/**
	 * 查询所有角色
	 */
	@RequestMapping("/list")
	public String allRole(Model model) {
		List<RoleDTO> list = roleService.allRole();
		model.addAttribute("list", list);
		return "list";
	}
	
	
	@RequestMapping("/update")
	public String update(@RequestParam("id") String id,Model model) {
		//查询传递过来的角色信息
		RoleDTO role = roleService.findRoleById(id);
		System.out.println("update-------"+role);
		
		model.addAttribute("role",role);
		return "update";
	}
	
}
