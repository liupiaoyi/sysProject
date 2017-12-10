/**   
 *       
 * 名称：MenuController   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月10日 下午4:30:55 
 * @version       
 */ 

package cn.com.taiji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.taiji.dto.MenuDTO;
import cn.com.taiji.service.MenuService;

/**        
 * 类名称：MenuController   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月10日 上午10:30:55 
 * @version      
 */

@Controller
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	/** 
	 * 查询所有菜单
	 */
	@RequestMapping("menuList")
	public String menuList(Model model){
		List<MenuDTO> list = menuService.allMenu();
		
		model.addAttribute("list", list);
		return "menulist";
	}
	
	
	/**
	 * 添加菜单
	 */
	@RequestMapping("toAddMenu")
	public String toAddMenu(){
		return "menu-add";
	}

	
	@RequestMapping("addMenu")
	public String addMenu(MenuDTO menuDTO) {
		menuService.addMenu(menuDTO);
		return "index";
	}
	
	
	/**
	 * 修改
	 */
	@RequestMapping("toUpdateMenu")
	public String toUpdateMenu(@RequestParam("id") String id,Model model){
		//获取用户信息
		MenuDTO menuDTO = menuService.findMenuById(id);
		model.addAttribute("menuDTO", menuDTO);
		return "menu-update";
	}
	
	
	@RequestMapping("updateMenu")
	public String updateMenu(){
		//@RequestParam("menuDTO")
		MenuDTO menuDTO = new MenuDTO("4","menuName","menuDesc","url","menu");
		//System.out.println(menuDTO);
		menuService.updateMenu(menuDTO);
		
		return "menu-update";
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("deleteMenu")
	public String deleteMenu(@RequestParam("id") String id) {
		menuService.deleteMenu(id);
		return "index";
	}
	
}
