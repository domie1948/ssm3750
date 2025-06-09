package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 还车结算
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
@TableName("haichejiesuan")
public class HaichejiesuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HaichejiesuanEntity() {
		
	}
	
	public HaichejiesuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
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
