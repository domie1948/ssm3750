package com.entity.model;

import com.entity.HaichejiesuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 还车结算
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public class HaichejiesuanModel  implements Serializable {
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
	 * 出租价格
	 */
	
	private Integer chuzujiage;
		
	/**
	 * 续租租金
	 */
	
	private Integer xuzuzujin;
		
	/**
	 * 事故费
	 */
	
	private Integer shigufei;
		
	/**
	 * 罚金费
	 */
	
	private Integer fajinfei;
		
	/**
	 * 其他费用
	 */
	
	private Integer qitafeiyong;
		
	/**
	 * 总额
	 */
	
	private Integer zonge;
		
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
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：出租价格
	 */
	 
	public void setChuzujiage(Integer chuzujiage) {
		this.chuzujiage = chuzujiage;
	}
	
	/**
	 * 获取：出租价格
	 */
	public Integer getChuzujiage() {
		return chuzujiage;
	}
				
	
	/**
	 * 设置：续租租金
	 */
	 
	public void setXuzuzujin(Integer xuzuzujin) {
		this.xuzuzujin = xuzuzujin;
	}
	
	/**
	 * 获取：续租租金
	 */
	public Integer getXuzuzujin() {
		return xuzuzujin;
	}
				
	
	/**
	 * 设置：事故费
	 */
	 
	public void setShigufei(Integer shigufei) {
		this.shigufei = shigufei;
	}
	
	/**
	 * 获取：事故费
	 */
	public Integer getShigufei() {
		return shigufei;
	}
				
	
	/**
	 * 设置：罚金费
	 */
	 
	public void setFajinfei(Integer fajinfei) {
		this.fajinfei = fajinfei;
	}
	
	/**
	 * 获取：罚金费
	 */
	public Integer getFajinfei() {
		return fajinfei;
	}
				
	
	/**
	 * 设置：其他费用
	 */
	 
	public void setQitafeiyong(Integer qitafeiyong) {
		this.qitafeiyong = qitafeiyong;
	}
	
	/**
	 * 获取：其他费用
	 */
	public Integer getQitafeiyong() {
		return qitafeiyong;
	}
				
	
	/**
	 * 设置：总额
	 */
	 
	public void setZonge(Integer zonge) {
		this.zonge = zonge;
	}
	
	/**
	 * 获取：总额
	 */
	public Integer getZonge() {
		return zonge;
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
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
