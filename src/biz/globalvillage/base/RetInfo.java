package biz.globalvillage.base;
/***
 * @author Administrator
 *	control层和service层交互bean类
 */
public class RetInfo {
   //成功失败的提示语  
	public String tip;
	
	//表示是否成功  0 成功 非0 是不错
 	public String mark;
	//返回的OBJECT，对应到前端所需要的bean类
 	public Object getObj() {
		return obj;
	}
 	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object obj;
}
