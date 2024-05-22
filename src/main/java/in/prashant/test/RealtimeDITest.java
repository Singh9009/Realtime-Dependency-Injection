//Realtime DI Test

package in.prashant.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.prashant.controller.MainController;
import in.prashant.vo.CustomerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/prashant/cfgs/applicationContext.xml");
		
		MainController controller = factory.getBean("controller", MainController.class);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter customet ID ");
		String cno = sc.nextLine();
		System.out.print("Enter Customer Name ");
		String name = sc.nextLine();
		System.out.print("Enter Customer Address ");
		String address = sc.nextLine();
		System.out.print("Enter Customer Bill Amt ");
		String amount = sc.nextLine();
		
		CustomerVO vo = new CustomerVO();
		vo.setcNo(cno);
		vo.setcName(name);
		vo.setcAddr(address);
		vo.setAmount(amount);
		
		 try {
		    	String result = controller.processCustomer(vo);
		    	System.out.println(result);
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
	}

}
