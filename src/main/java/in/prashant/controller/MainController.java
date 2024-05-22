//MainController.java

package in.prashant.controller;

import in.prashant.dto.CustomerDTO;
import in.prashant.service.ICustomerMgmtService;
import in.prashant.vo.CustomerVO;
import in.prashant.vo.CustomerVO;

public class MainController {

	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController.1-param const");
		this.service = service;
	}
	
	public String processCustomer(CustomerVO vo)throws Exception
	   {
		   CustomerDTO dto =new CustomerDTO();
		   dto.setCNo(Integer.parseInt(vo.getcNo()));
		   dto.setcName(vo.getcName());
		   dto.setCAddr(vo.getcAddr());
		   dto.setAmount(Float.parseFloat(vo.getAmount()));
		   
		   String result = service.registerCustomer(dto);
		   return result;
	   }
}
