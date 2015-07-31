package biz.globalvillage.rest.service;

import java.sql.Time;
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
import biz.globalvillage.bean.TdGvAirGaugeMachine;
import biz.globalvillage.bean.TdGvAirRecoverMachine;

@Controller
@RequestMapping(value="/device")
public class RestDevice {

	/**Purpose:查詢我的設備
	 * @author yxx
	 * Create Time: 2015年7月31日 上午11:54:50
	
	 * @param request
	 * @param response
	 * @param userId
	 * @return
	
	 * Version: 1.0
	 */
	@RequestMapping(value="/my",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody RetInfo myDevice(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value="userId",required=true)String userId){
		RetInfo info =new RetInfo();
		
		List<Object> machines= new ArrayList<Object>();
		TdGvAirRecoverMachine  machine1= 
				new TdGvAirRecoverMachine(1, "mac", new Timestamp(new Date().getTime()) ,
						"0",new Time(new Date().getTime()));
		TdGvAirGaugeMachine  machine2 = new TdGvAirGaugeMachine(1, "mac..");
		
		machines.add(machine1);
		machines.add(machine2);
		info.setMark("0");
		info.setObj(machines);
		return info;
	}
	
	
		/**Purpose:绑定设备
		 * @author yxx
		 * Create Time: 2015年7月31日 上午11:59:48
		
		 * @param request
		 * @param response
		 * @param userId
		 * @param mac
		 * @return
		
		 * Version: 1.0
		 */
		@RequestMapping(value="/binding",method={RequestMethod.GET,RequestMethod.POST})
		public @ResponseBody RetInfo bindingDevice(HttpServletRequest request, HttpServletResponse response,
				@RequestParam(value="userId",required=true)String userId,
				@RequestParam(value="mac",required=true)String mac){
			RetInfo info =new RetInfo();
			TdGvAirGaugeMachine  machine2 = new TdGvAirGaugeMachine(1, mac);
			info.setMark("0");
			info.setObj(machine2);
			return info;
		}
		
		
		
}
