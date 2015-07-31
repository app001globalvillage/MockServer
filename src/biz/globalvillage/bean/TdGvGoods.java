package biz.globalvillage.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;


/*
 * 商品信息表
 */
public class TdGvGoods {
	private int   god_id;//商品标示 主键
	private int   cate_id;//类别标示
	private String   god_title;//商品标题
	private String   god_vice_title;//商品副标题
	private BigDecimal   god_amount;//商品价格
	private String   god_introduction;//商品介绍
	private String   god_spec;//商品规格
	private String   god_service;//售后服务
	private int   god_size;//库存
	private int   sort;//排序
	private String   is_lock;//是否可用 0可用1不可用
	private String   is_apply;//是否申领商品 0是1不是
	private Timestamp   on_time;//上架时间
	private String   on_month;//上架月份
	private Timestamp   off_time;//下架 时间
	private String   off_month;//下架月份
	private String   remark;//备注
	private String   retain;//保留
	private BigDecimal   exp_amount;//运费金额
	private int sales_volume;//销量
//	public TdGvGoodsImage getImg(){
//		return DataInitUtil.tdGvGoodsImageCoverMap.get(String.valueOf(god_id));
//	}
	public int getGod_id() {
		return god_id;
	}
	public void setGod_id(int god_id) {
		this.god_id = god_id;
	}
	public int getCate_id() {
		return cate_id;
	}
	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}
	public String getGod_title() {
		return god_title;
	}
	public void setGod_title(String god_title) {
		this.god_title = god_title;
	}
	public String getGod_vice_title() {
		return god_vice_title;
	}
	public void setGod_vice_title(String god_vice_title) {
		this.god_vice_title = god_vice_title;
	}

	public String getGod_introduction() {
		return god_introduction;
	}
	public void setGod_introduction(String god_introduction) {
		this.god_introduction = god_introduction;
	}
	public String getGod_spec() {
		return god_spec;
	}
	public void setGod_spec(String god_spec) {
		this.god_spec = god_spec;
	}
	public String getGod_service() {
		return god_service;
	}
	public void setGod_service(String god_service) {
		this.god_service = god_service;
	}
	public int getGod_size() {
		return god_size;
	}
	public void setGod_size(int god_size) {
		this.god_size = god_size;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public String getIs_lock() {
		return is_lock;
	}
	public void setIs_lock(String is_lock) {
		this.is_lock = is_lock;
	}
	public String getIs_apply() {
		return is_apply;
	}
	public void setIs_apply(String is_apply) {
		this.is_apply = is_apply;
	}
	public Timestamp getOn_time() {
		return on_time;
	}
	public void setOn_time(Timestamp on_time) {
		this.on_time = on_time;
	}
	public String getOn_month() {
		return on_month;
	}
	public void setOn_month(String on_month) {
		this.on_month = on_month;
	}
	public Timestamp getOff_time() {
		return off_time;
	}
	public void setOff_time(Timestamp off_time) {
		this.off_time = off_time;
	}
	public String getOff_month() {
		return off_month;
	}
	public void setOff_month(String off_month) {
		this.off_month = off_month;
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
	public BigDecimal getExp_amount() {
		return exp_amount;
	}
	public void setExp_amount(BigDecimal exp_amount) {
		this.exp_amount = exp_amount;
	}
	public BigDecimal getGod_amount() {
		return god_amount;
	}
	public void setGod_amount(BigDecimal god_amount) {
		this.god_amount = god_amount;
	}
	public int getSales_volume() {
		return sales_volume;
	}
	public void setSales_volume(int sales_volume) {
		this.sales_volume = sales_volume;
	}
	
}
