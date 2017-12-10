/**   
 *       
 * 名称：UserDTO   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月9日 下午8:02:12 
 * @version       
 */ 

package cn.com.taiji.dto;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Lob;

import cn.com.taiji.domain.Role;

/**        
 * 类名称：UserDTO   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月9日 下午8:02:12 
 * @version      
 */

public class UserDTO {
	
	private String id;

	private int age;

	private Timestamp birthday;

	private String education;

	private String email;

	private String empType;

	private String firstDeptDesc;

	private Timestamp hiredate;

	private byte[] images;

	private String phone;

	private String positionLevel;

	private String positionName;

	private String positionOrder;

	private String secondDeptDesc;

	private byte sex;
	
	private String userName;

	private String userNum;

	private String workAddr;
	
	private List<RoleDTO> roleDTOs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getFirstDeptDesc() {
		return firstDeptDesc;
	}

	public void setFirstDeptDesc(String firstDeptDesc) {
		this.firstDeptDesc = firstDeptDesc;
	}

	public Timestamp getHiredate() {
		return hiredate;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

	public byte[] getImages() {
		return images;
	}

	public void setImages(byte[] images) {
		this.images = images;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPositionLevel() {
		return positionLevel;
	}

	public void setPositionLevel(String positionLevel) {
		this.positionLevel = positionLevel;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPositionOrder() {
		return positionOrder;
	}

	public void setPositionOrder(String positionOrder) {
		this.positionOrder = positionOrder;
	}

	public String getSecondDeptDesc() {
		return secondDeptDesc;
	}

	public void setSecondDeptDesc(String secondDeptDesc) {
		this.secondDeptDesc = secondDeptDesc;
	}

	public byte getSex() {
		return sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getWorkAddr() {
		return workAddr;
	}

	public void setWorkAddr(String workAddr) {
		this.workAddr = workAddr;
	}

	public List<RoleDTO> getRoles() {
		return roleDTOs;
	}

	public void setRoles(List<RoleDTO> roleDTOs) {
		this.roleDTOs = roleDTOs;
	}

	public UserDTO(String id, int age, Timestamp birthday, String education, String email, String empType,
			String firstDeptDesc, Timestamp hiredate, byte[] images, String phone, String positionLevel,
			String positionName, String positionOrder, String secondDeptDesc, byte sex, String userName, String userNum,
			String workAddr) {
		super();
		this.id = id;
		this.age = age;
		this.birthday = birthday;
		this.education = education;
		this.email = email;
		this.empType = empType;
		this.firstDeptDesc = firstDeptDesc;
		this.hiredate = hiredate;
		this.images = images;
		this.phone = phone;
		this.positionLevel = positionLevel;
		this.positionName = positionName;
		this.positionOrder = positionOrder;
		this.secondDeptDesc = secondDeptDesc;
		this.sex = sex;
		this.userName = userName;
		this.userNum = userNum;
		this.workAddr = workAddr;
	}

	public UserDTO(String id, int age, Timestamp birthday, String education, String email, String empType,
			String firstDeptDesc, Timestamp hiredate, byte[] images, String phone, String positionLevel,
			String positionName, String positionOrder, String secondDeptDesc, byte sex, String userName, String userNum,
			String workAddr, List<RoleDTO> roleDTOs) {
		super();
		this.id = id;
		this.age = age;
		this.birthday = birthday;
		this.education = education;
		this.email = email;
		this.empType = empType;
		this.firstDeptDesc = firstDeptDesc;
		this.hiredate = hiredate;
		this.images = images;
		this.phone = phone;
		this.positionLevel = positionLevel;
		this.positionName = positionName;
		this.positionOrder = positionOrder;
		this.secondDeptDesc = secondDeptDesc;
		this.sex = sex;
		this.userName = userName;
		this.userNum = userNum;
		this.workAddr = workAddr;
		this.roleDTOs = roleDTOs;
	}

	public UserDTO() {
		super();
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", age=" + age + ", birthday=" + birthday + ", education=" + education + ", email="
				+ email + ", empType=" + empType + ", firstDeptDesc=" + firstDeptDesc + ", hiredate=" + hiredate
				+ ", images=" + Arrays.toString(images) + ", phone=" + phone + ", positionLevel=" + positionLevel
				+ ", positionName=" + positionName + ", positionOrder=" + positionOrder + ", secondDeptDesc="
				+ secondDeptDesc + ", sex=" + sex + ", userName=" + userName + ", userNum=" + userNum + ", workAddr="
				+ workAddr + ", roles=" + roleDTOs + "]";
	}

	public UserDTO(String userName,String id, String education, String email, String empType, String firstDeptDesc, String phone,
			String positionLevel, String positionName) {
		super();
		this.id = id;
		this.education = education;
		this.email = email;
		this.empType = empType;
		this.firstDeptDesc = firstDeptDesc;
		this.phone = phone;
		this.positionLevel = positionLevel;
		this.positionName = positionName;
		this.userName = userName;
	}
	
	
	
}
