/**   
 *       
 * 名称：UserService   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午2:04:56 
 * @version       
 */ 

package cn.com.taiji.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.taiji.domain.Role;
import cn.com.taiji.domain.RoleRepository;
import cn.com.taiji.domain.User;
import cn.com.taiji.dto.RoleDTO;


/**        
 * 类名称：UserService   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午2:04:56 
 * @version      
 */

@Service
public class RoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	//map
	
	/**
	 * 
	 * @Description: 新增角色信息
	 * @param roleDto
	 * @return RoleDTO  
	 * @throws
	 * @author Administrator
	 * @date 2017年12月9日
	 */
	@Transactional
	public RoleDTO addRole( RoleDTO roleDto ) {
		//判断角色是否存在
		if(roleRepository.findOne( roleDto.getId() ) ==null ) {
			Role role = new Role();
			//将dto数据赋给实体类对象
			BeanUtils.copyProperties(roleDto,role);
			roleRepository.save(role);
		}
		return roleDto;
	}
	
	
	/**
	 * 修改角色信息
	 */
	@Transactional
	public void updateRole(String roleName,String id) {
		roleRepository.updateRoleNameById(roleName, id);
	}
	

	/**
	 * 查询所有角色
	 */
	public List<RoleDTO> allRole(){
		List<RoleDTO> list = new ArrayList<RoleDTO>();
		List<Role> findAll = roleRepository.findAll();
		
		for (Role role : findAll) {
			RoleDTO roleDTO = new RoleDTO();
			BeanUtils.copyProperties(role,roleDTO);
			
			list.add(roleDTO);
		}
		return list;
	}
	
	
	
	//按ID查询
	public RoleDTO findRoleById(String id) {
		RoleDTO roleDTO = new RoleDTO();
		Role role = roleRepository.findRoleById(id);
		BeanUtils.copyProperties(role,roleDTO);
		return roleDTO;
	}
	

	/**
	 * 删除角色
	 */
	@Transactional
	public void deleteRole(String id){
		roleRepository.delete(id);
	}

}
