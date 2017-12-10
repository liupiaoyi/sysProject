/**   
 *       
 * 名称：UserController   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月9日 下午8:19:41 
 * @version       
 */ 

package cn.com.taiji.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.taiji.domain.Role;
import cn.com.taiji.dto.RoleDTO;
import cn.com.taiji.dto.UserDTO;
import cn.com.taiji.service.RoleService;
import cn.com.taiji.service.UserService;

/**        
 * 类名称：UserController   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月9日 下午8:19:41 
 * @version      
 */
@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RoleService roleService;
	
	
	/**
	 * 查询所有用户
	 */
	@RequestMapping("/userList")
	public String allUser(Model model) {
		List<UserDTO> list = userService.allUser();
		
		model.addAttribute("list", list);
		return "userlist";
	}
	
	/**
	 * 跳到新增页面-- 新增用户
	 */
	@RequestMapping("/toAddUser")
	public String toAddUser() {
		return "addUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser() {
		UserDTO userDTO = new UserDTO();	
		
		userDTO.setId("5");
		userDTO.setUserNum("5");
		userDTO.setUserName("wu");
		userDTO.setSex( (byte)1 );
		userDTO.setEmpType("zhiyun");
		userDTO.setWorkAddr("beijing");
		
		userDTO.setFirstDeptDesc("yi");
		userDTO.setSecondDeptDesc("er");
		userDTO.setPositionName("m");
		userDTO.setPositionLevel("1");
		userDTO.setPositionOrder("2");
		
		userDTO.setHiredate( null );
		userDTO.setPhone("178");
		userDTO.setEmail("sina");
		userDTO.setEducation("school");
		userDTO.setAge(10);
		userDTO.setBirthday(null);
		
		userDTO.setImages(null);
		
		
		//给用户添加权限
		//if( userDTO.getRoles().isEmpty() ) {
			
		//}
	
		
		UserDTO addUser = userService.addUser(userDTO);
		System.out.println("addUser==="+addUser);
		return "index";
	}
	
	
	/**
	 * 修改用户信息
	 */
	//跳转到用户界面
	@RequestMapping("toUpdateUser")
	public String toUpdateUser(@RequestParam("id") String id,Model model) {
		//获取用户信息
		UserDTO userDTO = userService.findUserById(id);
		model.addAttribute("userDTO", userDTO);
		return "updateUser";
	}
	
	
	@RequestMapping("updateUser")
	public String updateUser(@RequestParam("userDTO") UserDTO userDTO) {
		userService.updateUser(userDTO);
		
		return "index";
	}
	
	
	
	/**
	 * 删除用户
	 */
	@RequestMapping("deleteUser")
	public String deleteUser(@RequestParam("id") String id) {
		userService.deleteUser(id);
		return "index";
	}
	
	
	/**
	 * 姓名查询
	 */
	@RequestMapping("search")
	public String search() {
		
		userService.getRoles();
		
		List<UserDTO> names = userService.findUserByUsername("2");
		names.forEach(System.out::println);
		return "index";
	}
	
	
}
