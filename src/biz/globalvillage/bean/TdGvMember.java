package biz.globalvillage.bean;

import java.sql.Timestamp;
/*
 * 用户信息
 */
public class TdGvMember {
	private int memb_id;//会员标示，主键，自增长
	private String user_name;//用户表示
	private String phone;//用户注册手机号码
	private String password;//用户登录密码
	private String user_type;//0会员1服务商
    private String is_lock;//是否锁定 0是1否
    private Timestamp reg_time;//注册时间
    private String reg_month;//注册月份
    private Timestamp lock_time;//锁定时间
	public int getMemb_id() {
		return memb_id;
	}
	public void setMemb_id(int memb_id) {
		this.memb_id = memb_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getIs_lock() {
		return is_lock;
	}
	public void setIs_lock(String is_lock) {
		this.is_lock = is_lock;
	}
	public Timestamp getReg_time() {
		return reg_time;
	}
	public void setReg_time(Timestamp reg_time) {
		this.reg_time = reg_time;
	}
	public String getReg_month() {
		return reg_month;
	}
	public void setReg_month(String reg_month) {
		this.reg_month = reg_month;
	}
	public Timestamp getLock_time() {
		return lock_time;
	}
	public void setLock_time(Timestamp lock_time) {
		this.lock_time = lock_time;
	}

}
