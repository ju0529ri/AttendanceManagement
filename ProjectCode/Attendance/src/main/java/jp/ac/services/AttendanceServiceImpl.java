package jp.ac.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.ac.entities.EmployeeVO;
import jp.ac.mappers.AttendanceMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {

	private static final Logger log = LogManager.getLogger(AttendanceService.class);
	
	@Autowired
	private AttendanceMapper mapper;
	
	@Override
	public String empSearch(EmployeeVO empVo) throws Exception {
		log.info("mapper.empSearch(empVo) : " + mapper.empSearch(empVo));
		return mapper.empSearch(empVo);
	}
	
	@Override
	public EmployeeVO empLogin(EmployeeVO empVo) throws Exception {
		return mapper.empLogin(empVo);
	}
}
