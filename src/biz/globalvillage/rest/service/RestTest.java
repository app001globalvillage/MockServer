package biz.globalvillage.rest.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RestTest {


	@RequestMapping(value="/test", method=RequestMethod.GET)
	public @ResponseBody String test(HttpServletRequest request, HttpServletResponse response){
		return "hello";
		
	}
	
}
