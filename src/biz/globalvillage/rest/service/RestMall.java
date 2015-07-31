package biz.globalvillage.rest.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import biz.globalvillage.base.RetInfo;
import biz.globalvillage.bean.TdGvAddress;
import biz.globalvillage.bean.TdGvCoupons;
import biz.globalvillage.bean.TdGvGoods;
import biz.globalvillage.bean.TdGvOrder;

/**
 * Project Name:globalvillageinterface
 * 
 * Package:biz.globalvillage.rest.service
 * 
 * FileName:RestMall.java
 * 
 * @author yxx
 * 
 * Purpose: 商城接口
 * 
 * Create Time: 2015年7月31日 下午6:08:58
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
@RequestMapping(value="mall")
public class RestMall {

	/**Purpose:全部商品列表
	 * @author yxx
	 * Create Time: 2015年7月31日 下午2:05:24
	
	 * @param request
	 * @param response
	 * @return  返回商品简介列表
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/catalogue",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo catalogue(HttpServletRequest request, HttpServletResponse response){
		RetInfo info =new RetInfo();
		List<Object> items= new ArrayList<Object>();
		
		TdGvGoods goods1= new TdGvGoods();
		goods1.setGod_id(1);
		goods1.setGod_title("空气复原机");
		
		TdGvGoods goods2= new TdGvGoods();
		goods2.setGod_id(2);
		goods2.setGod_title("空气检测机");
		
		items.add(goods2);
		items.add(goods1);
		
		info.setMark("0");
		info.setObj(items);
		return info;
	}
	
	
	/**Purpose:获取单个商品详细信息
	 * @author yxx
	 * Create Time: 2015年7月31日 下午3:15:00
	
	 * @param request
	 * @param response
	 * @param itemId
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/detail",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo detial(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="itemId",required=true)String itemId){
		RetInfo info =new RetInfo();

		TdGvGoods goods1= new TdGvGoods();
		goods1.setGod_id(1);
		goods1.setGod_title("空气复原机");
		goods1.setCate_id(1);
		goods1.setGod_service("service");
		goods1.setGod_vice_title("kjkjkjk");
		
		info.setMark("0");
		info.setObj(goods1);									
		return info;
	}
	
	/**Purpose:查询用户的地址
	 * @author yxx
	 * Create Time: 2015年7月31日 下午6:08:31
	
	 * @param request
	 * @param response
	 * @param userId
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/adress",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo adress(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="userId",required=true)String userId){
		RetInfo info =new RetInfo();
		TdGvAddress  adress = new TdGvAddress();
		adress.setMemb_id(Integer.valueOf(userId));
		adress.setAddress("地球村");
		adress.setAds_id(1);
		
		info.setMark("0");
		info.setObj(adress);
		return info;
	}
	
	/**Purpose:查询用户的优惠券
	 * @author yxx
	 * Create Time: 2015年7月31日 下午6:08:07
	
	 * @param request
	 * @param response
	 * @param userId
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/coupons",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo coupons(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="userId",required=true)String userId){
		RetInfo info =new RetInfo();
		TdGvCoupons  coupons= new TdGvCoupons();
		coupons.setMemb_id(Integer.valueOf(userId));
		coupons.setCpn_id(1);
		coupons.setCpn_category("test");
		coupons.setInvalid_time(new Timestamp(new Date().getTime()));
		
		info.setObj(coupons);
		info.setMark("0");
		return info;
	}
	
	/**Purpose:生成订单
	 * @author yxx
	 * Create Time: 2015年7月31日 下午6:07:50
	
	 * @param request
	 * @param response
	 * @param userId
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/confirm",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo confirm(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="userId",required=true)String userId){
		RetInfo info = new RetInfo();
		TdGvOrder order=new TdGvOrder();
		order.setOrd_id(1);
		order.setMemb_id(Integer.valueOf(userId));
		order.setAddress("test");
		
		info.setMark("0");
		info.setObj(order);
		
		
		return info;
	}
	
	
}
