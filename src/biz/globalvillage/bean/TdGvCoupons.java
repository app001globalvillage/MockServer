package biz.globalvillage.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/*
 * 代金券信息
 */
public class TdGvCoupons {
	private int cpn_id; //优惠券标示 主键
	private int   memb_id;//用户标示
	private Timestamp   invalid_time;//截止使用时间
	private BigDecimal    cpn_amount;//金额
	private String   is_invalid;//是否可用  0可用1不可用
	private String cpn_category;//类别 0通用 1商城券2服务券
	public int getCpn_id() {
		return cpn_id;
	}
	public void setCpn_id(int cpn_id) {
		this.cpn_id = cpn_id;
	}
	public int getMemb_id() {
		return memb_id;
	}
	public void setMemb_id(int memb_id) {
		this.memb_id = memb_id;
	}
	public Timestamp getInvalid_time() {
		return invalid_time;
	}
	public void setInvalid_time(Timestamp invalid_time) {
		this.invalid_time = invalid_time;
	}
	public BigDecimal getCpn_amount() {
		return cpn_amount;
	}
	public void setCpn_amount(BigDecimal cpn_amount) {
		this.cpn_amount = cpn_amount;
	}
	public String getIs_invalid() {
		return is_invalid;
	}
	public void setIs_invalid(String is_invalid) {
		this.is_invalid = is_invalid;
	}
	public String getCpn_category() {
		return cpn_category;
	}
	public void setCpn_category(String cpn_category) {
		this.cpn_category = cpn_category;
	}
	
}
