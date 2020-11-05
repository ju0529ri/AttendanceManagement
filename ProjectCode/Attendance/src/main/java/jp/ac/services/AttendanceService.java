package jp.ac.services;

import jp.ac.entities.EmployeeVO;

public interface AttendanceService {
	
	//login) id, password check
	public String empSearch(EmployeeVO empVo) throws Exception;
	
	//login) session
	public EmployeeVO empLogin(EmployeeVO empVo) throws Exception;
	
}
