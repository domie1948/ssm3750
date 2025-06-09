package com.entity.vo;

import com.entity.QicheweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 汽车维修
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public class QicheweixiuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车型
	 */
	
	private String chexing;
		
	/**
	 * 车辆颜色
	 */
	
	private String cheliangyanse;
		
	/**
	 * 维修内容
	 */
	
	private String weixiuneirong;
		
	/**
	 * 维修人员
	 */
	
	private String weixiurenyuan;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
				
	
	/**
	 * 设置：车型
	 */
	 
	public void setChexing(String chexing) {
		this.chexing = chexing;
	}
	
	/**
	 * 获取：车型
	 */
	public String getChexing() {
		return chexing;
	}
				
	
	/**
	 * 设置：车辆颜色
	 */
	 
	public void setCheliangyanse(String cheliangyanse) {
		this.cheliangyanse = cheliangyanse;
	}
	
	/**
	 * 获取：车辆颜色
	 */
	public String getCheliangyanse() {
		return cheliangyanse;
	}
				
	
	/**
	 * 设置：维修内容
	 */
	 
	public void setWeixiuneirong(String weixiuneirong) {
		this.weixiuneirong = weixiuneirong;
	}
	
	/**
	 * 获取：维修内容
	 */
	public String getWeixiuneirong() {
		return weixiuneirong;
	}
				
	
	/**
	 * 设置：维修人员
	 */
	 
	public void setWeixiurenyuan(String weixiurenyuan) {
		this.weixiurenyuan = weixiurenyuan;
	}
	
	/**
	 * 获取：维修人员
	 */
	public String getWeixiurenyuan() {
		return weixiurenyuan;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
			
}
