package biz.globalvillage.bean;

/*
 * 用户地址
 */
public class TdGvAddress {
	private int   ads_id;//主键标示
	private int   memb_id;//会员标示
	private String   confignee;//收货人
	private String   zip_code;//邮编
	private String   phone;//电话
	private int    province;//'省  从静态字典表中获取',
	private int    city;//'市  从数据字典表获取',
	private int    county;//'县 从数据字典表获取',
	private String   address;//收货地址
    private String   is_default;//是否默认地址 0是1否
    
	public int getAds_id() {
		return ads_id;
	}
	public void setAds_id(int ads_id) {
		this.ads_id = ads_id;
	}
	public int getMemb_id() {
		return memb_id;
	}
	public void setMemb_id(int memb_id) {
		this.memb_id = memb_id;
	}
	public String getConfignee() {
		return confignee;
	}
	public void setConfignee(String confignee) {
		this.confignee = confignee;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getProvince() {
		return province;
	}
	public void setProvince(int province) {
		this.province = province;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getCounty() {
		return county;
	}
	public void setCounty(int county) {
		this.county = county;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIs_default() {
		return is_default;
	}
	public void setIs_default(String is_default) {
		this.is_default = is_default;
	}
//	//获取地址
//	public String getArea() {
//		return DataInitUtil.tsGvdictMap.get(String.valueOf(province)).getCode_name()+","+DataInitUtil.tsGvdictMap.get(String.valueOf(city)).getCode_name()+","
//				+	DataInitUtil.tsGvdictMap.get(String.valueOf(county)).getCode_name();
//	}
	
    
}
