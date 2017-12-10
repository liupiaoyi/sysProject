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
import cn.com.taiji.domain.UserRepository;
import cn.com.taiji.dto.RoleDTO;
import cn.com.taiji.dto.UserDTO;

/**        
 * 类名称：UserService   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月8日 下午2:04:56 
 * @version      
 */
@Service
public class UserService {
	
	@Autowired
	UserRepository userRope;
	
	
	/**
	 * 新增用户
	 */
	@Transactional
	public UserDTO addUser(UserDTO userDTO) {
		//判断用户是否存在
		if(userRope.findOne( userDTO.getId() ) ==null ) {
			User user = new User();
			//将dto数据赋给实体类对象
			BeanUtils.copyProperties(userDTO,user);
			userRope.save(user);
		}
		return userDTO;
	}
	
	/**
	 * 查询所有用户
	 */
	public List<UserDTO> allUser(){
		List<UserDTO> userDTOList = new ArrayList<UserDTO>();
		//获取数据库中所有数据
		List<User> userList = userRope.findAll();
		for (User user : userList) {
			UserDTO userDTO = new UserDTO();
			//将实体类数据赋给 DTO
			BeanUtils.copyProperties(user,userDTO);
			userDTOList.add(userDTO);
		}
		return userDTOList;
	}
	
	
	//按id查询
	public UserDTO findUserById(String id) {
		UserDTO userDTO = new UserDTO();
		//获取用户信息
		User user = userRope.findOne(id);
		//将实体类数据赋给 DTO
		BeanUtils.copyProperties(user,userDTO);
		return userDTO;
	}
	
	
	//按姓名查询
	public List<UserDTO> findUserByUsername(String userName) {
		List<UserDTO> userDTOList = new ArrayList<UserDTO>();
		//获取用户信息
		List<User> users = userRope.findUserByUsername(userName);
		
		//将实体类数据赋给 DTO
		for (User user : users) {
			UserDTO userDTO = new UserDTO();
			BeanUtils.copyProperties(user,userDTO);
			userDTOList.add(userDTO);
		}
		return userDTOList;
	}
	
	
	
	/**
	 * 修改用户信息
	 */
	public void updateUser(UserDTO userDTO) {
		String id = userDTO.getId();
		//删除此用户信息
		userRope.delete(id);
		
		//新增
		addUser(userDTO);
		
	}
	
	
	/**
	 * 权限
	 */
	@Autowired
	RoleRepository roleRope;
	
	//public void getRoles(UserDTO userDTO,String id) {
	public void getRoles() {	
		//获取相应实体
		//User user = userRope.findOne(userDTO.getId());
		User user = userRope.findOne("1");
		//获取相应权限
		//Role role = roleRope.findOne(id);
		Role role = roleRope.findOne("111");
		
		List<Role> roles = new ArrayList<Role>();
		roles.add(role);
		
		user.setRoles( roles );
		
		userRope.save(user);
	
	}
	
	
	
	/**
	 * 删除用户--ok
	 */
	public void deleteUser(String id) {
		userRope.delete(id);
	}
	
}
