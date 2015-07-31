package biz.globalvillage.rest.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import biz.globalvillage.base.RetInfo;

@Controller
@RequestMapping(value="/password")
public class RestPassword {

	
	/**Purpose:发送短信
	 * @author Administrator
	
	 * Create Time: 2015年7月31日 上午9:16:55
	
	 * @param request
	 * @param response
	 * @param phoneNum
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/sms",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo sortMessageSend(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="phoneNum",required=true)String phoneNum){
		RetInfo info =new RetInfo();
		info.setMark("0");
		
		return info;
	}
	
	/**Purpose: 检查验证码
	 * @author yxx
	 * Create Time: 2015年7月31日 上午9:20:09
	
	 * @param request
	 * @param response
	 * @param verificationCode
	 * @param phoneNum
	 * @return
	
	 * Version: 1.0
	 */ 
	@RequestMapping(value="/checkcode",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo checkCode(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="verificationCode",required=true)String verificationCode,
			@RequestParam(value="phoneNum",required=true)String phoneNum){
		RetInfo info =new RetInfo();
		info.setMark("0");
		
		return info;
	}
	
	
	/**Purpose:重置密码
	 * @author yxx
	 * Create Time: 2015年7月31日 上午9:20:29
	
	 * @param request
	 * @param response
	 * @param verificationCode
	 * @param phoneNum
	 * @param password
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/reset",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo restPassword(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="password",required=true)String password){
		RetInfo info =new RetInfo();
		info.setMark("0");
		
		return info;
	}
	
}
