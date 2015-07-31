package biz.globalvillage.bean;

public class Verification {
	
	

	/**
	 * 手机号
	 */
	private String phoneNum;
	
	/**
	 * 验证码
	 */
	private Integer verificationCode;
	
	
	/**
	 * 状态码
	 */
	private String code;

	/**
	 * 提示语
	 */
	private String msg;

	
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Integer getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(Integer verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Verification() {

	}

	public Verification(String phoneNum, Integer verificationCode, String code,
			String msg) {
		super();
		this.phoneNum = phoneNum;
		this.verificationCode = verificationCode;
		this.code = code;
		this.msg = msg;
	}
	
	
	
}
