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
@RequestMapping(value="/entry")
public class RestEntry {
	
	
	
	
	/**Purpose:登录
	 * @author Administrator
	
	 * Create Time: 2015年7月31日 上午8:55:22
	
	 * @param request
	 * @param response
	 * @param phone
	 * @param type
	 * @param password
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/login",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo login(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="phone",required=true)String phone,
			@RequestParam(value="type",required=true)String type,
			@RequestParam(value="password",required=true)String password){
		RetInfo info = new RetInfo();
		info.setMark("0");
		info.setTip("登录成功");
		return info;
	
	
	}

	
	@RequestMapping(value="/regist",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo regist(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="password",required=true)String password){
		RetInfo info = new RetInfo();
		info.setMark("0");
		return info;
	}
		
	
	
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
		RetInfo info = new RetInfo();
		info.setMark("0");
		info.setTip("4564");
		return info;
	}
	
	/**Purpose:检查账户是否被禁用
	 * @author Administrator
	
	 * Create Time: 2015年7月31日 上午9:16:29
	
	 * @param request
	 * @param response
	 * @param account
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/checkaccount",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo checkAccount(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="account",required=true)String account){
		RetInfo info =new RetInfo();
		info.setMark("1");
		info.setTip("验证失败");
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
	
	
	

}
