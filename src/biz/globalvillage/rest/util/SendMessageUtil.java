package biz.globalvillage.rest.util;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import biz.globalvillage.bean.Verification;


public class SendMessageUtil {
	
	private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
	
	
	
	/**
	 * 调用验证码接口服务
	 * 
	 * @param account
	 * @param password
	 * @param phoneNum
	 * @return
	 */
	public static  Verification sendsms(String account, String password, String phoneNum) {
		
		Verification  bean= new  Verification();
		bean.setPhoneNum(phoneNum);
		
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(Url); 
			
		//client.getParams().setContentCharset("GBK");		
		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");

		
		int mobile_code = (int)((Math.random()*9+1)*100000);

		bean.setVerificationCode(mobile_code);
		//System.out.println(mobile);
		
	    String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。"); 

		NameValuePair[] data = {//提交短信
			    new NameValuePair("account", account), 
			    new NameValuePair("password", password), //密码可以使用明文密码或使用32位MD5加密
			    //new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
			    new NameValuePair("mobile", phoneNum), 
			    new NameValuePair("content", content),
		};
		
		method.setRequestBody(data);		
		
		
		try {
			client.executeMethod(method);	
			
			String SubmitResult =method.getResponseBodyAsString();
					
			//System.out.println(SubmitResult);

			Document doc = DocumentHelper.parseText(SubmitResult); 
			Element root = doc.getRootElement();


//			String code = root.elementText("code");	
//			String msg = root.elementText("msg");	
//			String smsid = root.elementText("smsid");	
			 bean.setMsg(root.elementText("msg"));
			
			 bean.setCode(root.elementText("code"));
			
						
//			 if("2".equals(code)){
//				 bean.setMsg(msg);
//				 bean.setVerificationCode(mobile_code);
//				System.out.println("短信提交成功");
//			}
			
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return bean;
		
	}
	
}