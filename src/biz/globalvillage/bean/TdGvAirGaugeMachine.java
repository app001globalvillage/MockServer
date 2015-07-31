package biz.globalvillage.bean;

import java.io.Serializable;

/**
 * @author yxx
 *  空气监测器实体类
 */
public class TdGvAirGaugeMachine implements  Serializable {

	private Integer id;
	
	/**
	 * 机器唯一标志码
	 */
	private String mac;
	
	/**
	 * 空气数据id
	 */
	private Integer dataId;

	public TdGvAirGaugeMachine() {

	}

	public TdGvAirGaugeMachine(Integer id, String mac) {
		super();
		this.id = id;
		this.mac = mac;
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

	public Integer getAirId() {
		return dataId;
	}

	public void setAirId(Integer airId) {
		this.dataId = airId;
	}
	
	
	
	
}
