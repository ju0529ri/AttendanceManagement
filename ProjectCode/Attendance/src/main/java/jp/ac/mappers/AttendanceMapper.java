package jp.ac.mappers;

import org.apache.ibatis.annotations.Mapper;

import jp.ac.entities.EmployeeVO;

@Mapper
public interface AttendanceMapper {
	
	//login) id, password check
	public String empSearch(EmployeeVO empVo) throws Exception;
		
	//login) session
	public EmployeeVO empLogin(EmployeeVO empVo) throws Exception;
	
}
