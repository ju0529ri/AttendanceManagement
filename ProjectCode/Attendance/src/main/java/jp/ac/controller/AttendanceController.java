package jp.ac.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.ac.entities.EmployeeVO;
import jp.ac.services.AttendanceService;

@Controller
public class AttendanceController {

	private static final Logger log = LogManager.getLogger(AttendanceController.class);
	
	private AttendanceService service;
	
	@RequestMapping(value = "/")
    public String home() {
        return "login";
    }
	
	@RequestMapping(value = "/empLogin", method = RequestMethod.POST)
	public void empLogin(EmployeeVO empVo) throws Exception{
		String lp = service.empSearch(empVo);
		log.info("empVO : " + empVo);
	}
	
		/* nullpointerexception error 수정하기
	 	@PostMapping("/empLogin")
	 	public String empLogin(EmployeeVO empVo, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{
		log.info("empLogin들어와따");
		
		request.getSession().invalidate();
		String loginPass = service.empSearch(empVo);
		
		EmployeeVO empVo2 = null;
		
		if(loginPass==null) {
			//아이디 없음
			model.addAttribute("isRow",-1);
			System.out.println("isRow : -1");
			return "/login";
		}else {
			if(loginPass.equals(empVo.getLoginPass())) {
				empVo2 =  service.empLogin(empVo);
				request.getSession().setAttribute("empVo2", empVo2);
				request.getSession().setMaxInactiveInterval(1800); //세션 유지 시간 설정
				System.out.println("isRow : success");
				return "redirect:/loginsuccess";
			}else {
				//비밀번호 틀림
				model.addAttribute("isRow",0);
				System.out.println("isRow : 0");
				return "/login";
			}
			
		}
		*/
}
