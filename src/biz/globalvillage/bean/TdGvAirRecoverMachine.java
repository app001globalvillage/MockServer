package biz.globalvillage.bean;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;

public class TdGvAirRecoverMachine  implements   Serializable{

	
	private Integer id;
	
	/**
	 * 机器唯一标志码
	 */
	private String mac;
	
	/**
	 * 滤芯绑定时间
	 */
	private Timestamp elementBindingTime;
	
	/**
	 * 是否绑定状态，0为绑定，1未绑定
	 */
	private String state;
	
	/**
	 * 出厂时间
	 */
	private Time factoryTime;

	public TdGvAirRecoverMachine() {

	}
	
	public TdGvAirRecoverMachine(Integer id, String mac,
			Timestamp elementBingdingTime, String state, Time factoryTime) {
		super();
		this.id = id;
		this.mac = mac;
		this.elementBindingTime = elementBingdingTime;
		this.state = state;
		this.factoryTime = factoryTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Timestamp getElementBingdingTime() {
		return elementBindingTime;
	}

	public void setElementBingdingTime(Timestamp elementBingdingTime) {
		this.elementBindingTime = elementBingdingTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Time getFactoryTime() {
		return factoryTime;
	}

	public void setFactoryTime(Time factoryTime) {
		this.factoryTime = factoryTime;
	}
	
	
}
