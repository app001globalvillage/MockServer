package biz.globalvillage.rest.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import biz.globalvillage.base.RetInfo;

/**
 * Project Name:globalvillageinterface
 * 
 * Package:biz.globalvillage.rest.service
 * 
 * FileName:RestCart.java
 * 
 * @author yxx
 * 
 * Purpose: 购物车接口
 * 
 * Create Time: 2015年7月31日 下午6:09:13
 * 
 * Create Specification:
 * 
 * Modified Time:
 * 
 * Modified by:
 * 
 * Modified Specification:
 * 
 * Version: 1.0
 */
@Controller
@RequestMapping(value="/cart")
public class RestCart {

	/**Purpose:加入购物车
	 * @author yxx
	 * Create Time: 2015年7月31日 下午6:09:28
	
	 * @param request
	 * @param response
	 * @param id
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/add",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo add(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="itemId",required=true)String itemId){
		RetInfo info =new RetInfo();
		
		info.setMark("0");
		return info;
	}
	
	
	/**Purpose:修改购物车
	 * @author yxx
	 * Create Time: 2015年7月31日 下午6:09:41
	
	 * @param request
	 * @param response
	 * @param itemId
	 * @param count
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/update",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo update(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="itemId",required=true)String itemId,
			@RequestParam(value="count",required=true)String count){
		RetInfo info =new RetInfo();
		
		info.setMark("0");
		return info;
	}
	
	/**Purpose:显示购物车
	 * @author yxx
	 * Create Time: 2015年7月31日 下午6:09:57
	
	 * @param request
	 * @param response
	 * @param userId
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/show",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo show(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="userId",required=true)String userId){
		RetInfo info =new RetInfo();
		
		info.setMark("0");
		return info;
	}
	
	
}
