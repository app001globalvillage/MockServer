package biz.globalvillage.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/*
 * 订单信息
 */
public class TdGvOrder {
	private int   ord_id;//订单标示
	private int   memb_id;//用户标示
	private int   exp_id;//快递标示
	private String   exp_number;//快递单号
	private int   god_id;//商品标示
	private int   god_size;//商品数量
	private BigDecimal   god_amount;//订单金额
	private BigDecimal   cpn_amount;//使用代金券价值
	private BigDecimal   pay_amount;//实际支付金额
	private String   ord_number;//订单编号
	private BigDecimal   exp_amount;//运费金额
	private String   ord_state;//订单状态1待支付2待发货
	private Timestamp   ord_time;//下单时间
	private String   ord_month;//下单月份
	private Timestamp   end_time;//完成时间
	private String   end_month;//完成月份
	private String   remark;//备注
	private String   retain;//保留
	private Timestamp   deliver_time;//发货时间
	private String   deliver_month;//发货月份
	private String address;//地址
	public int getOrd_id() {
		return ord_id;
	}
	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}
	public int getMemb_id() {
		return memb_id;
	}
	public void setMemb_id(int memb_id) {
		this.memb_id = memb_id;
	}
	public int getExp_id() {
		return exp_id;
	}
	public void setExp_id(int exp_id) {
		this.exp_id = exp_id;
	}
	public String getExp_number() {
		return exp_number;
	}
	public void setExp_number(String exp_number) {
		this.exp_number = exp_number;
	}
	public int getGod_id() {
		return god_id;
	}
	public void setGod_id(int god_id) {
		this.god_id = god_id;
	}

	public int getGod_size() {
		return god_size;
	}
	public void setGod_size(int god_size) {
		this.god_size = god_size;
	}
	public BigDecimal getGod_amount() {
		return god_amount;
	}
	public void setGod_amount(BigDecimal god_amount) {
		this.god_amount = god_amount;
	}
	public BigDecimal getCpn_amount() {
		return cpn_amount;
	}
	public void setCpn_amount(BigDecimal cpn_amount) {
		this.cpn_amount = cpn_amount;
	}
	public BigDecimal getPay_amount() {
		return pay_amount;
	}
	public void setPay_amount(BigDecimal pay_amount) {
		this.pay_amount = pay_amount;
	}
	public String getOrd_number() {
		return ord_number;
	}
	public void setOrd_number(String ord_number) {
		this.ord_number = ord_number;
	}
	public BigDecimal getExp_amount() {
		return exp_amount;
	}
	public void setExp_amount(BigDecimal exp_amount) {
		this.exp_amount = exp_amount;
	}
	public String getOrd_state() {
		return ord_state;
	}
	public void setOrd_state(String ord_state) {
		this.ord_state = ord_state;
	}
	public Timestamp getOrd_time() {
		return ord_time;
	}
	public void setOrd_time(Timestamp ord_time) {
		this.ord_time = ord_time;
	}
	public String getOrd_month() {
		return ord_month;
	}
	public void setOrd_month(String ord_month) {
		this.ord_month = ord_month;
	}
	public Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}
	public String getEnd_month() {
		return end_month;
	}
	public void setEnd_month(String end_month) {
		this.end_month = end_month;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRetain() {
		return retain;
	}
	public void setRetain(String retain) {
		this.retain = retain;
	}
	public Timestamp getDeliver_time() {
		return deliver_time;
	}
	public void setDeliver_time(Timestamp deliver_time) {
		this.deliver_time = deliver_time;
	}
	public String getDeliver_month() {
		return deliver_month;
	}
	public void setDeliver_month(String deliver_month) {
		this.deliver_month = deliver_month;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
